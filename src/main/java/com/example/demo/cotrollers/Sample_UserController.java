package com.example.demo.cotrollers;

import com.example.demo.classes.Sample_User;
import com.example.demo.models.Sample_UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class Sample_UserController {

    private Sample_UserModel userModel = new Sample_UserModel();

    @GetMapping({"/", "/user"})
    public ModelAndView viewUser() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sample_user");
        mv.addObject("users", userModel.getUsers());
        return mv;
    }

    @PostMapping("postUser")
    public void postUser(HttpServletRequest request, HttpServletResponse response) {

        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String role =request.getParameter("role");

        Sample_User user = new Sample_User(name, gender, role);

        userModel.addUser(user);

        try {
            response.sendRedirect("/");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
