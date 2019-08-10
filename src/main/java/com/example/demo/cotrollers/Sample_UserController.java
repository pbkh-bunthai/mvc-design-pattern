//package com.example.demo.cotrollers;
//
//import com.example.demo.classes.Sample_User;
//import com.example.demo.models.Sample_UserModel;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Controller
//public class Sample_UserController {
//
//    private Sample_UserModel userModel = new Sample_UserModel();
//
//    @GetMapping({"/", "/user"})
//    public ModelAndView viewUser() {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("sample_user"); // map with view
//        mv.addObject("users", userModel.getUsers()); // map with model
//        return mv;
//    }
//
//    @PostMapping("postUser")
//    public void postUser(HttpServletRequest request, HttpServletResponse response) {
//
//        // to get parameter value
//        // request.getParameter(" ... ");
//
//        try {
//            response.sendRedirect("/");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//}
