public class PositiveNumberHandler extends BaseHandler {
    public void handle (Number num){
        if(num.longValue()>0){
            System.out.println("Processing positive number "+num.longValue());
        } else{
            super.handle(num);
        }
    }
}
