package study.web.user.dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import study.gen.vo.CsMbrBaseInfo;
import study.web.WelcomeController;

public class MybatisTest {
	private static final Logger log = LoggerFactory.getLogger(WelcomeController.class);

	@Test
	public void test() throws Exception{
		String resource = "datasource-context-test.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);	
	
	//	SqlSession session = sqlSessionFactory.openSession();
		try (SqlSession session = sqlSessionFactory.openSession()){
			CsMbrBaseInfo user = session.selectOne("study.gen.dao.CsMbrBaseInfoMapper.selectByPrimaryKey", 1);
			
			log.debug("############### {}", user);
		} 
	}

}
