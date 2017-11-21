package study.web.user.dao;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import study.common.AbstractDao;
import study.web.user.vo.UserVo;

@Repository("userDao")
public class UserDao extends AbstractDao{
	private static final Logger log = LoggerFactory.getLogger(UserDao.class);

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectUserList(Map<String, Object> commandMap) {
		
		return (List<Map<String, Object>>) selectList("User.selectUserList", commandMap);
	}

	public UserVo selectByPrimaryKey(Map<String, Object> commandMap) {
		
		return (UserVo) selectOne("User.selectByPrimaryKey", commandMap);
	}
	
	public void insertUser(Map<String, Object> commandMap) {

		insert("User.insert", commandMap);
	}

	public void updateUser(Map<String, Object> commandMap) {

		update("User.update", commandMap);
	}

	public void deleteUser(Map<String, Object> commandMap) {

		delete("User.delete", commandMap);
	}

}