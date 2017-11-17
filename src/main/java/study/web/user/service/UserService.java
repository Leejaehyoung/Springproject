package study.web.user.service;

import java.util.List;
import java.util.Map;

public interface UserService {

	List<Map<String, Object>> selectUserList(Map<String, Object> commandMap);

}
