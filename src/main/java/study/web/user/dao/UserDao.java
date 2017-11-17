package study.web.user.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import study.common.AbstractDao;

@Repository("userDao")
public class UserDao extends AbstractDao{

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectUserList(Map<String, Object> commandMap) {
		
		return (List<Map<String, Object>>) selectList("study.web.user.dao.UserDao.selectUserList", commandMap);
	}

}
