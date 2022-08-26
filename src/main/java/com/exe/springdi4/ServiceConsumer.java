package com.exe.springdi4;

public class ServiceConsumer {

	MessageService ms;
	TimeService ts;
	JobService js;
	
	/**메소드로 의존성 주입을 하기 위해서는 기본생성자 선언이 꼭 필요*/
	public ServiceConsumer() {}
	
	/**[생성자로 의존성 주입]*/
	public ServiceConsumer(MessageService ms) {
		this.ms = ms;
	}
	
	/**[메소드로 의존성 주입]
	 * 
	 * 메소드로 의존성 주입을 할 때에는 기본생성자가 꼭 필요해서 위에서 선언
	 * 기본생성자로 객체생성을 한 후에 메소드가 실행되기 때문
	 * 
	 * app-context.xml 에서 매개변수를 넣어줘야 실행됨*/
	public void setTimeService(TimeService ts) {
		this.ts = ts;
	}

	public void setJobService(JobService js) {
		this.js = js;
	}

	
	public void consumerService() {
		
//		GenericXmlApplicationContext context = 
//				new GenericXmlApplicationContext("app-context.xml");
//		
//		MessageService ms = (MessageService)context.getBean("messageService");
		
		String message = ms.getMessage();
		System.out.println(message);
		
		String time = ts.getTimeString();
		System.out.println(time);
		
		/**getJob 메소드는 자체적으로 print를 할 수 있기 때문에
		 * 호출만 해주면 출력됨*/
		js.getJob();
	}
	
	
}
