package spring.chap15;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class Dao {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	//list ��������
	public List<Dto> getList(){
		
		List<Dto> list =sqlSessionTemplate.selectList("mapperNamespace.getList");
		return list;
		
	}
	
	//insert �غ���
	public int insertMember(Dto dto){
		int resultNum =sqlSessionTemplate.insert("mapperNamespace.insertMember", dto);
		return resultNum;
	}
	
	
	//update �غ���
	public int updateMember(Dto dto){
		int resultNum =sqlSessionTemplate.update("mapperNamespace.updateMember", dto);
		return resultNum;
	}
	
	//delete �غ���
	public int deleteMember(String memberId){
		int resultNum = sqlSessionTemplate.delete("mapperNamespace.deleteMember",memberId);
		return resultNum;
	}
	
	
}
