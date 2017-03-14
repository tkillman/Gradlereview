package spring.chap14;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class Dao extends JdbcDaoSupport{

	//jdbcTemplate�� �ڵ������� ��� �� �� �ִ� ���
	//��. extends JdbcDaoSupport
	//��. getJdbcTemplate()�� jdbcTemplate�� �� �� �ִ�.
	
	
	
	/*JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	 */
	
	
	// List ��������

	public List<Dto> getList() {

		String sql = "select * from member";
		Mapper rowMapper = new Mapper();
		//List<Dto> list = jdbcTemplate.query(sql, rowMapper);
		List<Dto> list = getJdbcTemplate().query(sql, rowMapper);
		return list;
	}

	//insert �غ���
	public int insertMem(String[] info){
		String sql="insert into member values(?,?,?,?)";
		Mapper rowMapper = new Mapper();
		//int resultNum =jdbcTemplate.update(sql, info);
		int resultNum =getJdbcTemplate().update(sql, info);
		return resultNum;
	}
	
	//CountNum �غ���
	public int CountNum(){
		String sql= "select count(*) from member";
		Mapper rowMapper = new Mapper();
		int resultNum = getJdbcTemplate().queryForObject(sql,Integer.class);
		return resultNum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
