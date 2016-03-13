package org.zw.spring.mvc.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zw.spring.mvc.entity.User;
import org.zw.spring.mvc.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/user")
public class UserAction {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(HttpServletRequest request,
                        HttpServletResponse response) {
        request.setAttribute("users", userService.getAllUsers());
        return "list";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(HttpServletRequest request,
                      HttpServletResponse response) {
        return "add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(User user, HttpServletRequest request,
                      HttpServletResponse response) {
        userService.addUser(user);
        return "redirect:list";
    }

    @RequestMapping(value = "edit/{name}", method = RequestMethod.GET)
    public String edit(@PathVariable(value = "name") String name, HttpServletRequest request,
                       HttpServletResponse response) {
        request.setAttribute("user", userService.getUserByName(name));
        return "edit";
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public String edit(User user, HttpServletRequest request,
                      HttpServletResponse response) {
        userService.updateUser(user);
        return "redirect:list";
    }
}
