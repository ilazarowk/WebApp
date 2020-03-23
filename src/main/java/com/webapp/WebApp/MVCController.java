package com.webapp.WebApp;

import javax.servlet.http.HttpSession;

import org.jasig.cas.client.boot.configuration.EnableCasClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MVCController {
	/*@GetMapping("/CASlogin")
	public ModelAndView redirectWithUsingRedirectPrefix(ModelMap model) {
        model.addAttribute("service", "http://localhost:8000");
        return new ModelAndView("redirect:/https://cas.example.org/cas/login", model);
    }*/
	
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	} 
	
	@GetMapping("/")
	public ModelAndView inicio(Model model) {
		return new ModelAndView("index");
	} 
	
	@RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:https://cas.example.org:8443/cas/logout?service=http://localhost:8000";
    }
}
