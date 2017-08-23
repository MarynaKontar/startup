package ua.goit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.goit.entity.User;
import ua.goit.services.UserService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by User on 21.08.2017.
 */
@Controller
@RequestMapping(value = "/user")
public class ShowUsersController {
    @Autowired
    private UserService usersService;

    @RequestMapping(method = RequestMethod.GET, value = "/show")
    public ModelAndView showUsers() {
        List<String> usernames =
                usersService.findAll().stream().map(User::getUsername).collect(Collectors.toList());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("users");
        modelAndView.addObject("users", usernames);
        return modelAndView;
    }


}
