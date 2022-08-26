package com.exe.springdi2;

public class MessageCall {

	public static void main(String[] args) {
		
		/**개별로 객체 생성*/
		MessageKr ob1 = new MessageKr();
		ob1.sayHello("유인나");
		
		MessageEn ob2 = new MessageEn();
		ob2.sayHello("inna");

		
		
		/**Message 인터페이스 선언*/
		Message ms = null;

		/**인터페이스로 객체 생성*/
		ms = new MessageKr();
		ms.sayHello("정인선");
	
		ms = new MessageEn();
		ms.sayHello("insun");
	}

}
