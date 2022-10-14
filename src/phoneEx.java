public class phoneEx {
    public static void main(String[] args){
        smartPhone smartPhone = new smartPhone("홍길동");
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

//        Phone 클래스는 추상클래스 이므로 new 키워드를 통해 객체를 생성할 수 없다.
//        Phone phone = new Phone("홍길동");
        Phone phone;
//        phone = new Phone("홍길동");


    }
}
