package in.pspk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;


@Controller

public class DashboardController {

	
	 @GetMapping("/dashboard")
	    public String showDashboard(Model model, Principal principal) {
	        if (principal != null) {
	            String username = principal.getName();
	            model.addAttribute("username", username);
	        }
	        return "dashboard";
	    }




}
