package com.exam4.exam4.controllers;
import com.exam4.exam4.Models.VirusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;


@Controller
public class MainController
{
    @Autowired
    VirusRepo virRepo;

    @RequestMapping("/")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("viruslist", virRepo.findAll());
        return mv;
    }
}