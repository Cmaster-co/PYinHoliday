package co.cmaster.controller;


import co.cmaster.models.ProUserEntity;
import co.cmaster.models.ProjectEntity;
import co.cmaster.models.UserEntity;
import co.cmaster.repository.ProUserRepository;
import co.cmaster.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/5/27 0027.
 */
@Controller
public class ProjectController {
    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    ProUserRepository proUserRepository;

    @RequestMapping(value = "/project/{id}", method = RequestMethod.GET)
    public String showProject(@PathVariable("id") Integer projectId, ModelMap modelMap){
        ProjectEntity projectEntity = projectRepository.findOne(projectId);
        modelMap.addAttribute("project", projectEntity);
        return "project/projectDetail";
    }

    @RequestMapping(value = "/upload/{id}", method = RequestMethod.GET)
    public String uploadPage(@PathVariable("id") Integer projectId, ModelMap modelMap, HttpSession httpSession){
        UserEntity user = (UserEntity) httpSession.getAttribute("user");
        if(user != null){
            ProUserEntity proUserEntity = proUserRepository.findByPU(projectId, user.getId());
            if (proUserEntity.getAdmin() == 1){
                httpSession.setAttribute("projectId",projectId);
                return "project/upload";
            }
        }
        return "redirect:/login";
    }

    @RequestMapping(value = "/uploadP", method = RequestMethod.POST)
    public void uploadPic(@RequestParam("pic")MultipartFile file, HttpServletRequest request, HttpServletResponse response, HttpSession httpSession) throws IOException{
        String fileName = file.getOriginalFilename();
        File tempFile = new File("/upload/",new Date().getTime()+String.valueOf(fileName));
        if (!tempFile.exists()) {
            tempFile.createNewFile();
        }
        file.transferTo(tempFile);
        ProjectEntity projectEntity = projectRepository.findOne((Integer) httpSession.getAttribute("projectId"));
        projectEntity.setMore(tempFile.getName());
        projectRepository.save(projectEntity);
        response.setContentType("text/html;charset=utf8");
        response.getWriter().write("<img src='"+tempFile.getName()+"'/>");
    }

}
