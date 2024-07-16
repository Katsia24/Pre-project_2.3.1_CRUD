package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.model.User;
import web.service.CarServiceImp;
import web.service.UserServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController {

    @GetMapping(value = "/users")
    public String printUsers(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("It's page with users (PP_2.3.1-CRUD)!");

        UserServiceImp userServiceImp = new UserServiceImp();
        List<User> userList = userServiceImp.listUsers();

        for (User user : userList) {
            messages.add(user.toString());
        }

        model.addAttribute("messages", messages);
        model.addAttribute("userList", userList);

        return "users";
    }

}