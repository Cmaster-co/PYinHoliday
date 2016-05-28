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

    @RequestMapping(value = "/admin/projects", method = RequestMethod.GET)
    public String showProjects(ModelMap modelMap){
        List<ProjectEntity> projectList = projectRepository.findAll();
        modelMap.addAttribute("projectList", projectList);
        return "admin/projects";
    }

    @RequestMapping(value = "/admin/projects/add", method = RequestMethod.GET)
    public String addProject(){return "admin/addProject";}

    @RequestMapping(value = "/admin/projects/addP", method = RequestMethod.POST)
    public String addProjectPost(@ModelAttribute("project") ProjectEntity projectEntity){
        projectRepository.saveAndFlush(projectEntity);
        return "redirect:/admin/projects";
    }

    @RequestMapping(value = "/admin/projects/show/{id}", method = RequestMethod.GET)
    public String showProject(@PathVariable("id") Integer projectId, ModelMap modelMap){
        ProjectEntity projectEntity = projectRepository.findOne(projectId);
        modelMap.addAttribute("project", projectEntity);
        return "admin/projectDetail";
    }

    @RequestMapping(value = "/admin/projects/update/{id}", method = RequestMethod.GET)
    public String updateProject(@PathVariable("id") Integer projectId, ModelMap modelMap){
        ProjectEntity projectEntity = projectRepository.findOne(projectId);
        modelMap.addAttribute("project", projectEntity);
        return "admin/updateProject";
    }

    @RequestMapping(value = "/admin/projects/updateP", method = RequestMethod.POST)
    public String updateProjectPost(@ModelAttribute("projectP") ProjectEntity project){
        projectRepository.updateProject(project.getPasswd(), project.getLocation(),project.getId());
        projectRepository.flush();
        return "redirect:/admin/projects";
    }

    @RequestMapping(value = "/admin/projects/delete/{id}", method = RequestMethod.GET)
    public String deleteProject(@PathVariable("id") Integer projectId){
        projectRepository.delete(projectId);
        projectRepository.flush();
        return "redirect:/admin/projects";
    }
}
