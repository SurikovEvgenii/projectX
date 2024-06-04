package org.projectx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CreateProjectController {

    @PostMapping("/")
    public void createProject(Model model){

    }
}
