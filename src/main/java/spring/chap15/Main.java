package spring.chap15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext15.xml");
		Dao dao = (Dao)context.getBean("dao");
		
		//list 꺼내오기
		
		/*List<Dto> list= dao.getList();
		
		for(Dto dto : list){
			System.out.println(dto);
		}*/
		
		//insert 해보기
		/*Dto dto = new Dto("xks","234","inesk","jfjwn@daum.net");
		System.out.println(dao.insertMember(dto));*/
		
		//update 해보기
		
		/*Dto dto = new Dto();
		dto.setEmail("modifyemail@daum.net");
		dto.setMemberId("dj");
		
		System.out.println(dao.updateMember(dto));
		*/
		
		//delete
		System.out.println(dao.deleteMember("dj"));
		
		
		
		
		
	}//main 메소드 종료
	
	
}//클래스 종료
