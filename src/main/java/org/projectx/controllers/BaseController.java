package org.projectx.controllers;

import org.projectx.services.account.DesignerRepositoryService;
import org.projectx.services.projects.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class BaseController {

    @Autowired
    ProjectService projectService;

    @Autowired
    DesignerRepositoryService designerRepositoryService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("project", projectService.findAll());
        return "index";
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @GetMapping("/designer/{id}")
    public String designerPage(@PathVariable Long id, Model model){
        model.addAttribute("designer", designerRepositoryService.findById(id));
        return "designer";
    }
}
