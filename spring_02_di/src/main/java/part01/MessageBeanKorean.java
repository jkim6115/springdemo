package part01;

public class MessageBeanKorean implements MessageBean {
	
	public MessageBeanKorean() {
		System.out.println("MessageBeanKorea");
	}

	@Override
	public void sayHello(String name) {
		System.out.printf("안녕, %s !!!", name);
	}
	
}
