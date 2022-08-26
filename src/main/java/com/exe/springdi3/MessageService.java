package com.exe.springdi3;

import org.springframework.context.support.GenericXmlApplicationContext;

/**Service Ŭ������ �ٸ� Ŭ������ ���� Ŭ���� ������ ������ ������ �Ѵ�
 * ���� Ŭ������ �ٸ� Ŭ������ �ٷ� �̾����� �ʰԲ�*/
public class MessageService {

	/**xml�� �о�ͼ� �ڵ����� ��ü�� �����ǰԲ� �Ѵ�*/
	public void messageService() {
		
		/**BeanFactory ����*/
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("app-context.xml");
		
		/**Bean ȹ��*/
		/**xml�� <bean id="message" class="com.exe.springdi3.MessageKr"/> �� ��ü�� ������
		 * ms���� MessageKr ��ü�� �������*/
		Message ms = (Message)context.getBean("message");
		ms.sayHello("�����");
	}
}
