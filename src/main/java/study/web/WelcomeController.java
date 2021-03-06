package study.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	private static final Logger log = LoggerFactory.getLogger(WelcomeController.class);

	@RequestMapping("/main.sps")
	public @ResponseBody ModelAndView index() {
		ModelAndView mv = new ModelAndView("main");
		
		log.debug("Main Test");
		
		return mv;
	}

	@RequestMapping("/come.sps")
	public @ResponseBody String welcome() {
		log.debug("Spring Project Start!!");
		
		return "<h1>Spring Project Start!!</h1>";
	}
	
}
