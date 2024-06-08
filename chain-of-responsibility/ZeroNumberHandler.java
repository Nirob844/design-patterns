public class ZeroNumberHandler extends BaseHandler {
	public void handle(Number num) {
		if (num.longValue() == 0) {
			System.out.println("Processing zero number " + num.longValue());
		} else  {
			super.handle(num);
		}
	}
}