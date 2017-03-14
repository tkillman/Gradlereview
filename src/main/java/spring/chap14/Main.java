package spring.chap14;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext14.xml");
		Dao dao = (Dao)context.getBean("dao");
		
		
		//List로 꺼내오기
		
		/*List<Dto> list = dao.getList();
		for(Dto dto : list){
			System.out.println(dto);
		}*/		
		
		//insert 해보기
		
		/*String[] info = {"xk","234","houjon","cnnd@naver.com"};
		System.out.println(dao.insertMem(info));*/
		
		//전체 수 가져오기
		System.out.println(dao.CountNum());
		
		
		
		
		
		
	}
	
}
