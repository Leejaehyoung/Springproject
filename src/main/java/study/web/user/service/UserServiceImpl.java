package study.web.user.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import study.web.user.dao.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService {
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Resource(name="userDao")
	private UserDao userDao;
	
	@Override
	public 	List<Map<String, Object>> selectUserList(Map<String, Object> commandMap) {
		return userDao.selectUserList(commandMap);
	}

}
