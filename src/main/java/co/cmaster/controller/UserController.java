package co.cmaster.controller;

import co.cmaster.models.ProUserEntity;
import co.cmaster.models.ProjectEntity;
import co.cmaster.models.UserEntity;
import co.cmaster.repository.ProUserRepository;
import co.cmaster.repository.ProjectRepository;
import co.cmaster.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    ProUserRepository proUserRepository;

    @RequestMapping(value = "/joinProject", method = RequestMethod.GET)
    public String joinProject(){
        return "";
    }

    @RequestMapping(value = "/joinProject/{id}", method = RequestMethod.GET)
    public String  joinProjectId(@PathVariable("id") Integer projectid, HttpSession httpSession, ModelMap modelMap){
        ProjectEntity project = projectRepository.findOne(projectid);
        modelMap.addAttribute("project",project);
        return "user/joinProject";
    }

    @RequestMapping(value = "/joinProjectP", method = RequestMethod.POST)
    public String joinProjectPost(@ModelAttribute("project") ProjectEntity projectEntity, HttpSession httpSession){
        UserEntity user = (UserEntity) httpSession.getAttribute("user");
        ProjectEntity project = projectRepository.findByPP(projectEntity.getId(),projectEntity.getPasswd());
        if (user != null && project != null){
            if(proUserRepository.findByPU(project.getId(),user.getId()) == null) {
                ProUserEntity pu = new ProUserEntity();
                pu.setUser(user.getId());
                pu.setProject(project.getId());
                pu.setAdmin(0);
                proUserRepository.saveAndFlush(pu);
            }
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/createProject", method = RequestMethod.GET)
    public String createProject(){
        return "user/createProject";
    }

    @RequestMapping(value = "/createProjectP", method = RequestMethod.POST)
    public String createProjectPost(@ModelAttribute("project") ProjectEntity projectEntity, HttpSession httpSession){
        UserEntity user = (UserEntity)httpSession.getAttribute("user");
        projectEntity.setTime(new java.sql.Timestamp(System.currentTimeMillis()));
        projectEntity = projectRepository.save(projectEntity);
        projectRepository.flush();
        System.out.print("====="+projectEntity.getId()+"-----");
        if (user != null && projectEntity != null) {
                ProUserEntity pu = new ProUserEntity();
                pu.setUser(user.getId());
                pu.setProject(projectEntity.getId());
                pu.setAdmin(1);
                proUserRepository.saveAndFlush(pu);
        }

        return "redirect:/";
    }

}
