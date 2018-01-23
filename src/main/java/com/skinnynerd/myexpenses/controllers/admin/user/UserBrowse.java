package com.skinnynerd.myexpenses.controllers.admin.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserBrowse {
    @RequestMapping("/admin/users")
    public ModelAndView getAllUsers() {
        return null;
    }
}
