package co.cmaster.controller;


import co.cmaster.models.ProjectEntity;
import co.cmaster.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Administrator on 2016/5/27 0027.
 */
@Controller
public class ProjectController {
    @Autowired
    ProjectRepository projectRepository;

    @RequestMapping(value = "/project/{id}", method = RequestMethod.GET)
    public String showProject(@PathVariable("id") Integer projectId, ModelMap modelMap){
        ProjectEntity projectEntity = projectRepository.findOne(projectId);
        modelMap.addAttribute("project", projectEntity);
        return "project/projectDetail";
    }

}
