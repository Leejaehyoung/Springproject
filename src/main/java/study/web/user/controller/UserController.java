package study.web.user.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import study.web.user.service.UserService;

@Controller
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Resource(name="userService")
	private UserService userService;

	@RequestMapping(value="/users.sps")
	public @ResponseBody ModelAndView selectById(Map<String, Object> commandMap) {
		ModelAndView mv = new ModelAndView("user/userList");
		
		List<Map<String, Object>> list = userService.selectUserList(commandMap);
		mv.addObject("list", list);
		
		return mv;
	}
	
}
