public interface Handler {
	public void setNext(Handler handler);
	public void handle(Number num);
}