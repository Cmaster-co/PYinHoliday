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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/26 0026.
 */
@Controller
public class MainController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    ProUserRepository proUserRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap modelMap, HttpSession httpSession) {
        List<ProjectEntity> projectList = projectRepository.findAll();
        modelMap.addAttribute("projectList", projectList);
        UserEntity user = (UserEntity)httpSession.getAttribute("user");
        if(user != null){
            List<ProUserEntity> myprouserList = proUserRepository.findByUser(user.getId());
            List<ProjectEntity> myprojectList = new ArrayList<ProjectEntity>();
            for (ProUserEntity p:myprouserList
                 ) {
                myprojectList.add(projectRepository.findOne(p.getProject()));
            }
            modelMap.addAttribute("myprojectList", myprojectList);
        }
        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginP(@ModelAttribute("user") UserEntity userEntity, HttpSession httpSession){
        UserEntity ue = userRepository.findByUP(userEntity.getUsername(), userEntity.getPasswd());
        if (ue != null) {
            ue.setPasswd("");
            httpSession.setAttribute("user", ue);
            if (ue.getAdmin() == 1) return "redirect:/admin/admin";
            else return "redirect:/";
        }else{
            return "redirect:/failLogin";
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(){
        return "register";
    }

    @RequestMapping(value = "/registerP", method = RequestMethod.POST)
    public String regitterPost(@ModelAttribute("user") UserEntity userEntity, ModelMap modelMap){
        userEntity.setAdmin(0);
        UserEntity user = userRepository.findByUname(userEntity.getUsername());
        if(user == null){
            userRepository.save(userEntity);
            userRepository.flush();
            return "/registerSuccess";
        }else{
            modelMap.addAttribute("error","username alreadly existed");
            return "register";
        }
    }

    @RequestMapping(value = "/failLogin", method = RequestMethod.GET)
    public String failLogin(ModelMap model){
        model.addAttribute("error","true");
        return "login";
    }

    @RequestMapping(value = "/logoff", method = RequestMethod.GET)
    public String logoff(HttpSession httpSession, ModelMap model){
        httpSession.setAttribute("user",null);
        return "redirect:/";
    }
}
