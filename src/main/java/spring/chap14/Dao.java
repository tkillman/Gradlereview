package spring.chap14;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class Dao extends JdbcDaoSupport{

	//jdbcTemplate을 자동적으로 사용 할 수 있는 방법
	//ㄱ. extends JdbcDaoSupport
	//ㄴ. getJdbcTemplate()로 jdbcTemplate을 쓸 수 있다.
	
	
	
	/*JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	 */
	
	
	// List 꺼내오기

	public List<Dto> getList() {

		String sql = "select * from member";
		Mapper rowMapper = new Mapper();
		//List<Dto> list = jdbcTemplate.query(sql, rowMapper);
		List<Dto> list = getJdbcTemplate().query(sql, rowMapper);
		return list;
	}

	//insert 해보기
	public int insertMem(String[] info){
		String sql="insert into member values(?,?,?,?)";
		Mapper rowMapper = new Mapper();
		//int resultNum =jdbcTemplate.update(sql, info);
		int resultNum =getJdbcTemplate().update(sql, info);
		return resultNum;
	}
	
	//CountNum 해보기
	public int CountNum(){
		String sql= "select count(*) from member";
		Mapper rowMapper = new Mapper();
		int resultNum = getJdbcTemplate().queryForObject(sql,Integer.class);
		return resultNum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
