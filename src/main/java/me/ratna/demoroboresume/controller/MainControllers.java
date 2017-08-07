package me.ratna.demoroboresume.controller;

import me.ratna.demoroboresume.Repository;
import models.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;

@Controller
public class MainControllers {

    @Autowired
    Repository resumeRepository;
    @GetMapping("/")
    public String defaultRequest (Model model){
        String myMessage = "You are welcomed to the Resume Building Application";
        model.addAttribute("message", myMessage);
        return "main";
    }
    @GetMapping("/addresume")
    public String addresume(Model model){
        model.addAttribute("newResume", new Resume());
        return "addresume";
    }
    @PostMapping("/addresume")
    public String postResume(@Valid @ModelAttribute("newResume") Resume resume, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "addresume";
        }
        resumeRepository.save(resume);
        return "result";
    }
    @GetMapping("/showallresume")
    public String showAllResume(Model model){
        Iterable<Resume>allresume =resumeRepository.findAll();
        model.addAttribute("resume", allresume);
        return "showallresume";
    }
}
