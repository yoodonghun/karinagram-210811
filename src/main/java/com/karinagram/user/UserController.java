package com.karinagram.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserController {
   
	@RequestMapping("/signUp_view")
	public String logInView(Model model) {
		model.addAttribute("viewName", "user/sign-up");
		
		return "template/layout";
	}
}
