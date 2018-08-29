//package co.gc.tasklist;
//
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import co.grandcircus.authdemo.dao.UserDao;
//import co.grandcircus.authdemo.entity.User;
//import co.grandcircus.authdemo.github.GithubService;
//
//@Controller
//public class AuthController {
//
//	@Autowired
//	UserDao userDao;
//	@Autowired
//	GithubService githubService;
//
//	@RequestMapping("/login")
//	public ModelAndView showLoginForm() {
//		return new ModelAndView("login");
//	}
//
//	@PostMapping("/login")
//	// get the username and password from the form when it's submitted.
//	public ModelAndView submitLoginForm(HttpSession session, @RequestParam("username") String username, @RequestParam("password") String password) {
//		User user = userDao.findByUsername(username);
//		if (user != null && password.equals(user.getPassword())) {
//			//Match!
//			session.setAttribute("user", user);
//			
//			return new ModelAndView("redirect:/");
//			
//		} else {
//			//Not a match
//		ModelAndView mav = new ModelAndView("login");
//		mav.addObject("message", "Incorrect username or password.");
//		return mav;
//	}
//	}
//
//	@RequestMapping("/logout")
//	public ModelAndView logout(HttpSession session, RedirectAttributes redir) {
//		
//		session.invalidate();
//		redir.addAttribute("message", "Logged out.");
//		return new ModelAndView("redirect:/");
//	}
//
//	// This is the second step in OAuth. After the user approves the login on the github site, it redirects back
//	// to our site with a temporary code.
//	@RequestMapping("/oauth-github-callback")
//	public ModelAndView handleGithubCallback(@RequestParam("code") String code, HttpSession session) {
//		// First we must exchange that code for an access token.
//		String accessToken = githubService.getGithubAccessToken(code);
//		// Then we can use that access token to get information about the user and other things.
//		User githubUser = githubService.getUserFromGithubApi(accessToken);
//
//		// Check to see if the user is already in our database.
//		User user = userDao.findByGithubId(githubUser.getGithubId());
//		if (user == null) {
//			// if not, add them.
//			user = githubUser;
//			userDao.save(user);
//		}
//
//		// Set the user on the session, just like the other type of login.
//		session.setAttribute("user", user);
//		// In some apps, you need the access token later, so throw that on the session, too.
//		session.setAttribute("githubAccessToken", accessToken);
//
//		return new ModelAndView("redirect:/");
//	}
//
//	
//
//}
