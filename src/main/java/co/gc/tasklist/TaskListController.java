package co.gc.tasklist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TaskListController {

	@RequestMapping("/")
	public ModelAndView showIndexPage() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/registration")
	public ModelAndView showRegistrationPage() {
		ModelAndView mav = new ModelAndView("registration");
		return mav;
	}	
}
