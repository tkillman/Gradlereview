package spring.chap15;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

public class Dao extends SqlSessionDaoSupport{

	/*@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}*/
	
	//list 꺼내오기
	public List<Dto> getList(){
		
		//List<Dto> list =sqlSessionTemplate.selectList("mapperNamespace.getList");
		List<Dto> list =getSqlSession().selectList("mapperNamespace.getList");
		return list;
		
	}
	
	//insert 해보기
	public int insertMember(Dto dto){
		//int resultNum =sqlSessionTemplate.insert("mapperNamespace.insertMember", dto);
		int resultNum =getSqlSession().insert("mapperNamespace.insertMember", dto);
		return resultNum;
	}
	
	
	//update 해보기
	public int updateMember(Dto dto){
		//int resultNum =sqlSessionTemplate.update("mapperNamespace.updateMember", dto);
		int resultNum =getSqlSession().update("mapperNamespace.updateMember", dto);
		return resultNum;
	}
	
	//delete 해보기
	public int deleteMember(String memberId){
		//int resultNum = sqlSessionTemplate.delete("mapperNamespace.deleteMember",memberId);
		int resultNum = getSqlSession().delete("mapperNamespace.deleteMember",memberId);
		return resultNum;
	}
	
	
}
