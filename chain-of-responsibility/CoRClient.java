public class CoRClient {

	public static void main(String[] args) {
		Handler h1 = new PositiveNumberHandler();
		Handler h2 = new NegativeNumberHandler();
		Handler h3 = new ZeroNumberHandler();
		h1.setNext(h2);
		h2.setNext(h3);
		h1.handle(0);
		h1.handle(100);
		h1.handle(-10);
	}
}