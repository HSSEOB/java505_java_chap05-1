import java.util.Scanner;
import package1.A;
import package1.B;


public class Main {
    public static void main(String[] args){
        System.out.println("-------------- 상속 --------------");
        Scanner scanner = new Scanner(System.in);
        Point p = new Point();
        p.set(1,2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3,4);
        cp.setColor(
                "레드");
        cp.showColorPoint();


//        문제1) 클래스 SumSub와 MultiDiv을 생성하고, SumSub에는 멤버 변수 num1, num2를 가지고
//              멤버 메서드 sum(), sub()를 가지도록하며, MultiDiv에는 멤버 변수 result, 멤버 메서드 multi(), div()를 가지도록 하고,
//              마지막으로 Calculator 클래스를 생성하여 두 개의 클래스 모두를 상속받아 모든 기능을 사용할 수 있는 클래스로 작성하고, 각각
//              사칙연산을 수행하시오
//              1. SumSub > MultiDiv> Calcultor 순서대로 상속받기
//              2. Calculator클래스는 나머지 연산을 위한 멤버 메서드 other()를 가지고 있음.
//
//
        System.out.println("정수 두개를 입력하세요 >> ");

        Calculator calc = new Calculator();

        calc.other(scanner.nextInt(), scanner.nextInt());

        System.out.println("두 정수의 합은 "+ calc.sum());
        System.out.println("두 정수의 차는 "+ calc.sub());
        System.out.println("두 정수의 곱은 "+ calc.multi());
        System.out.println("두 정수의 비는 "+ calc.div());


        System.out.println("\n------------------------\n");

        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10 );
//      super();
        System.out.println("모델 : "+ dmbCellPhone.model);
        System.out.println("색상 : "+ dmbCellPhone.color);
        System.out.println("채널 : "+ dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요 저는 길동이인데요");
        dmbCellPhone.sendVoice("아~ 반갑습니다.");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannerlDmb(12);
        dmbCellPhone.turnOffDmb();

        Student std = new Student("홍길동","123123-123123",3);

        System.out.println("\n");

        int r =10;
        Calculator1 calculator1 = new Calculator1();
        System.out.println("원의 면적 : "+calculator1.areaCircle(r));
        System.out.println(calculator1.sum());
        System.out.println(calculator1.sub());
        System.out.println();

        Computer computer=new Computer();
        System.out.println("원의 면적 : "+ computer.areaCircle(r));
        System.out.println(computer.sum());
        System.out.println(computer.sub());
        System.out.println(computer.sub(10, 3));

        System.out.println("\n");

        SuperSonicAirplaneEx superSonicAirplaneEx = new SuperSonicAirplaneEx();
        superSonicAirplaneEx.execute();


        B b= new B();
        b.method();

        //              문제2) 교제 234페이지의 실습문제 1번.




    }
}