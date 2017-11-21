package study.web.user.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import study.common.CommandMap;
import study.web.user.service.UserService;
import study.web.user.vo.UserVo;

@Controller
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Resource(name="userService")
	private UserService userService;

	// 사용자 목록 가져오기
	@RequestMapping(value="/users.sps")
	public @ResponseBody ModelAndView users(Map<String, Object> commandMap) {
		ModelAndView mv = new ModelAndView("user/userList");
		
		List<Map<String, Object>> list = userService.selectUserList(commandMap);
		mv.addObject("list", list);
		
		return mv;
	}
	
	// 사용자 정보(상세) 가져오기
	@RequestMapping(value="/user.sps")
	public @ResponseBody ModelAndView user(CommandMap commandMap) {
	    ModelAndView mv = new ModelAndView("user/userDetail");
	    commandEntry(commandMap);

	    UserVo map = userService.selectByPrimaryKey(commandMap.getMap());
	    mv.addObject("map", map);

	    return mv;
	}

	// 사용자 등록 화면 보기
	@RequestMapping(value="/userinsert.sps")
	public @ResponseBody ModelAndView openuser(CommandMap commandMap) {
	    ModelAndView mv = new ModelAndView("user/userInsert");
	    commandEntry(commandMap);

	    return mv;
	}

	// 사용자 등록 후 목록 가져오기
	@RequestMapping(value="/insertuser.sps")
	public @ResponseBody ModelAndView insert(CommandMap commandMap) {
		ModelAndView mv = new ModelAndView("redirect:/users.sps");
	    commandEntry(commandMap);
		
		userService.insertUser(commandMap.getMap());
		
		return mv;
	}

	// 사용자 수정 후 목록 가져오기
	@RequestMapping(value="/updateuser.sps")
	public @ResponseBody ModelAndView update(CommandMap commandMap) {
		ModelAndView mv = new ModelAndView("redirect:/users.sps");
	    commandEntry(commandMap);
		
		userService.updateUser(commandMap.getMap());
		
		return mv;
	}

	// 사용자 삭제 후 목록 가져오기
	@RequestMapping(value="/deleteuser.sps")
	public @ResponseBody ModelAndView delete(CommandMap commandMap) {
		ModelAndView mv = new ModelAndView("redirect:/users.sps");
	    commandEntry(commandMap);
		
		userService.deleteUser(commandMap.getMap());
		
		return mv;
	}

	// 사용자 정보 로그 확인용
	private void commandEntry(CommandMap commandMap) {
		if(commandMap.isEmpty() == false){
	        Iterator<Entry<String,Object>> iterator = commandMap.getMap().entrySet().iterator();
	        
	        Entry<String,Object> entry = null;
	        while(iterator.hasNext()){
	            entry = iterator.next();
	            log.debug("key : "+entry.getKey()+", value : "+entry.getValue());
	        }
	    }
	}

}
