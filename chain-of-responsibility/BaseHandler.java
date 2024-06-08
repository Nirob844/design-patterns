public abstract class BaseHandler implements Handler  {
    private Handler next;

    @Override
    public void handle(Number num) {
        if (next != null) {
            next.handle(num);
        }
        
    }

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
        
    }
    
}