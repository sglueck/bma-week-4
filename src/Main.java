
public class Main {
	public static void main(String[] args) {
		String message = getHelloMessage();
		System.out.println(message);
	}
	
	static String helloMessage = "Hello World";
	
	static String getHelloMessage() {
		return helloMessage;
	}

}

