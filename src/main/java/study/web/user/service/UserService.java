package study.web.user.service;

import java.util.List;
import java.util.Map;

import study.web.user.vo.UserVo;

public interface UserService {

	List<Map<String, Object>> selectUserList(Map<String, Object> commandMap);

	UserVo selectByPrimaryKey(Map<String, Object> commandMap);

	void insertUser(Map<String, Object> commandMap);

	void updateUser(Map<String, Object> commandMap);

	void deleteUser(Map<String, Object> commandMap);

}
