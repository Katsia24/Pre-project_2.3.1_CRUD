package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController {

    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/users")
    public String printUsers(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("It's page with users (PP_2.3.1-CRUD)!");

        List<User> userList = userService.listUsers();

        for (User user : userList) {
            messages.add(user.toString());
        }

        model.addAttribute("messages", messages);
        model.addAttribute("userList", userList);

        return "users";
    }

    @GetMapping(value = "/usersN")
    public String printUsersN(ModelMap model) {
        model.addAttribute("userList", userService.listUsers());
        return "usersN";
    }

    @PostMapping("/addUser")
    public String addUser(@RequestParam("firstName")String firstName,
                          @RequestParam("lastName")String lastName,
                          @RequestParam("email")String email) {
        userService.add(new User(firstName, lastName, email));
        return "redirect:/usersN";
    }

    @PostMapping("/deleteUser")
    public String deleteUser(@RequestParam("id")Long id) {
        User user = userService.findById(id);
        if(user != null) {
            userService.delete(user);
        }
        return "redirect:/usersN";
    }

    @PostMapping("/updateUser")
    public String updateUser(@ModelAttribute User user) {
        userService.update(user);
        return "redirect:/usersN";
    }




}