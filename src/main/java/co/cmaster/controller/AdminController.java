package co.cmaster.controller;

import co.cmaster.models.UserEntity;
import co.cmaster.repository.UserRepository;
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
public class AdminController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/admin/admin", method = RequestMethod.GET)
    public String AdminIndex(ModelMap modelMap){
        return "admin/admin";
    }

    @RequestMapping(value = "/admin/users", method = RequestMethod.GET)
    public String getUsers(ModelMap modelMap){
        List<UserEntity> userList = userRepository.findAll();
        modelMap.addAttribute("userList", userList);
        return "admin/users";
    }

    @RequestMapping(value = "/admin/users/add", method = RequestMethod.GET)
    public String addUser(){
        return "admin/addUser";
    }

    @RequestMapping(value = "/admin/users/addP", method = RequestMethod.POST)
    public String addUserPost(@ModelAttribute("user") UserEntity userEntity){
        userRepository.saveAndFlush(userEntity);
        return "redirect:/admin/users";
    }

    @RequestMapping(value = "/admin/users/show/{id}", method = RequestMethod.GET)
    public String showUser(@PathVariable("id") Integer userId, ModelMap modelMap){
        UserEntity userEntity = userRepository.findOne(userId);
        modelMap.addAttribute("user", userEntity);
        return "admin/userDetail";
    }

    @RequestMapping(value = "/admin/users/update/{id}", method = RequestMethod.GET)
    public String updateUser(@PathVariable("id") Integer userId, ModelMap modelMap){
        UserEntity userEntity = userRepository.findOne(userId);
        modelMap.addAttribute("user", userEntity);
        return "admin/updateUser";
    }

    @RequestMapping(value = "/admin/users/updateP", method = RequestMethod.POST)
    public String updateUserPost(@ModelAttribute("userP") UserEntity user){
        userRepository.updateUser(user.getPasswd(),user.getAge(),user.getCity(),user.getSex(),user.getId());
        userRepository.flush();
        return "redirect:/admin/users";
    }

    @RequestMapping(value = "/admin/users/delete/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("id") Integer userId){
        userRepository.delete(userId);
        userRepository.flush();
        return "redirect:/admin/users";
    }
}
