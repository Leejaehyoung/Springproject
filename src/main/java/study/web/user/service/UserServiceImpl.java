package study.web.user.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import study.web.user.dao.UserDao;
import study.web.user.vo.UserVo;

@Service("userService")
public class UserServiceImpl implements UserService {
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Resource(name="userDao")
	private UserDao userDao;
	
	@Override
	public 	List<Map<String, Object>> selectUserList(Map<String, Object> commandMap) {
		
		return userDao.selectUserList(commandMap);
	}

	@Override
	public 	UserVo selectByPrimaryKey(Map<String, Object> commandMap) {
		
		return userDao.selectByPrimaryKey(commandMap);
	}

	@Override
	public 	void insertUser(Map<String, Object> commandMap) {
		
		userDao.insertUser(commandMap);
	}

	@Override
	public 	void updateUser(Map<String, Object> commandMap) {
		
		userDao.updateUser(commandMap);
	}
	@Override
	public 	void deleteUser(Map<String, Object> commandMap) {
		
		userDao.deleteUser(commandMap);
	}

}
