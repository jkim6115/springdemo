package sample03;

/*
 *	factory을 이용하면 결합도는 인터페이스보다 낮다.
 *	그러나 정확히 구현되어 있지 않다면 참조되는 객체에 영향이 간다.
 */

public class HelloSpring {

	public static void main(String[] args) {
		MessageBean bean = null;
//		bean = MessageFactory.getInstance("ko");
//		display(bean, "스프링");

		bean = MessageFactory.getInstance("en");
		display(bean, "Spring");
	}
	
	public static void display(MessageBean bean, String subject) {
		bean.sayHello(subject);
	}
	
}
