package com.cj.uaap.web.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cj.uaap.entity.Resource;
import com.cj.uaap.entity.User;
import com.cj.uaap.service.ResourceService;
import com.cj.uaap.service.UserService;
import com.cj.uaap.web.bind.annotation.CurrentUser;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-2-14
 * <p>Version: 1.0
 */
@Controller
public class IndexController {

    @Autowired
    private ResourceService resourceService;
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(@CurrentUser User loginUser, Model model) {
        //Set<String> permissions = userService.findPermissions(loginUser.getUsername());
       // List<Resource> menus = resourceService.findMenus(permissions);
        //model.addAttribute("menus", menus);
        return "index";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }


}
