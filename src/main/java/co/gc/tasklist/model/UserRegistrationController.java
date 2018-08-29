package co.gc.tasklist.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.gc.tasklist.dao.UserDao;


@Controller
public class UserRegistrationController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value="/registerUser", method=RequestMethod.POST)
	public ModelAndView registerUser(User user) {
		userDao.create(user);		
		return new ModelAndView("/login");
	}
	
}
