package sample02;

public class MessageBeanEnglish implements MessageBean {
	
	public MessageBeanEnglish() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sayHello(String name) {
		System.out.printf("Hello, %s", name);
	}
	
}
