public class NegativeNumberHandler extends BaseHandler {
    public void handle(Number num){
        if(num.longValue() < 0){
            System.out.println("Processing negative number " + num.longValue());
        } else {
            super.handle(num);
        }
    }
}
