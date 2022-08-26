package com.exe.springdi4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/** @Component : 객체 생성 */
@Component("serviceConsumer")
public class ServiceConsumer {
	
	/** @Autowired : 의존성 주입
	 * 	(객체가 생성되었다는 조건) */
	
	@Autowired
	@Qualifier("messageService")
	MessageService ms;
	
	@Autowired
	TimeService ts;
	
	@Autowired
	JobService js;
	
	
	public void consumerService() {

		String message = ms.getMessage();
		System.out.println(message);
		
		String time = ts.getTimeString();
		System.out.println(time);
		
		/**getJob 메소드는 자체적으로 print를 할 수 있기 때문에
		 * 호출만 해주면 출력됨*/
		js.getJob();
	}
	
	
}
