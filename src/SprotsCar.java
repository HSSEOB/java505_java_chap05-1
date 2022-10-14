public class SprotsCar extends Car{

    public final String sound = "뿅뿅";

    @Override
    public void speedUp(){
        speed +=10;
//        멤버 변수에 final이 사용되어 수정 금지
//        public void sound(){}
    }

//    부모 클래스의 멤버 메서드인 stop()의 final이 사용되고 있어서 오버라이드 사용 금지.
//    @Override
//    public final void stop() {
//        System.out.println("차가 멈춤");
//        speed = 0;
//    }
}
