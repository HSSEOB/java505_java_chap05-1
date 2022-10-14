// 추상 클래스 : 추상 메서드를 1개 이상 가지고 있는 클래스.
// 추상 클래스는 객체를 생성 할 수 없다 (반드시 자식 클래스가 상속받아 추상 메서드를 오버라이딩 해야 함)
// 자식 클래스가 추상 클래스를 상속 받았을 경우 반드시 추상 메서드를 오버라이딩 해야 함.
// (만일 오버라이딩 하지 않을 경우 자식 클래스도 추상 클래스로 선언해야 한다.)
// 추상 클래스는 자식 클래스를 규격화 하기 위해 사용함.

public abstract class animal {
    public String kind;

    public void breathe(){
        System.out.println("숨을 쉽니다.");
    }



    public abstract void sound();{
        System.out.println("짖음");
    }


}
