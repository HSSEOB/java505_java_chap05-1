public class ChildEx {
    public static void main(String[] args){
//        Child child =new Child();
//
//        Parent parent = child;
//        parent.method1();
//        parent.method2();


        Parent parent = new Parent();
        parent.method1();
        parent.method2();

        System.out.println("--------------");

        Child child = new Child();
        child.method1();
        child.method2();
        child.method3();

        System.out.println("--------------");

//        다형성 : 부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입하여 부모 클래스 타입의 객체인 것처럼 사용하는 것.
//                실제 결과물은 자식 클래스 타입의 객체가 가지고 있는 데이터로 출력.
//        child = parent;
        parent = child;
        parent.method1();
        parent.method2();
//        부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입했을 경우 자동 형변환이 발생하여 자식 클래스 타입의 객체가 전용으로 가지고 있던 멤버를 활용 할 수 없다.
//        부모 클래스 멤버만 사용 할 수 있다.
//        parent.method3();



    }
}
