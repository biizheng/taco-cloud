package tacos.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String home(Model model) {
		model.addAttribute("message", "Hello World!");
		return "home";
	}
}
