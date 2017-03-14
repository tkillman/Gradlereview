package spring.chap15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext15.xml");
		Dao dao = (Dao)context.getBean("dao");
		
		//list ��������
		
		/*List<Dto> list= dao.getList();
		
		for(Dto dto : list){
			System.out.println(dto);
		}*/
		
		//insert �غ���
		/*Dto dto = new Dto("xks","234","inesk","jfjwn@daum.net");
		System.out.println(dao.insertMember(dto));*/
		
		//update �غ���
		
		/*Dto dto = new Dto();
		dto.setEmail("modifyemail@daum.net");
		dto.setMemberId("dj");
		
		System.out.println(dao.updateMember(dto));
		*/
		
		//delete
		System.out.println(dao.deleteMember("dj"));
		
		
		
		
		
	}//main �޼ҵ� ����
	
	
}//Ŭ���� ����
