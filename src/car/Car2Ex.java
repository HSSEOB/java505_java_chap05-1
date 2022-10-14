package car;

public class Car2Ex {
    public static void main(String[] args){
        Car2 car2 = new Car2();

        for(int i = 1; i<=5 ; i++){
            int problemLocation= car2.run();

            switch (problemLocation){
                case 1:
                    System.out.println("앞 왼쪽 HankookTire로 교체");
                    car2.frontLeftTire = new HankookTire("앞 왼쪽", 15);
                    break;

                case 2:
                    System.out.println("앞 오른쪽 KumhoTire로 교체");
                    car2.frontRightTire = new KumhoTire("앞 오른쪽", 13);
                    break;

                case 3:
                    System.out.println("뒤 왼쪽 HankookTire로 교체");
                    car2.backLeftTire = new HankookTire("뒤 왼쪽", 14);
                    break;

                case 4:
                    System.out.println("앞 왼쪽 KumhoTire로 교체");
                    car2.backRightTire = new KumhoTire("뒤 오른쪽", 17);
                    break;
            }
            System.out.println("-------------");
        }

        System.out.println("\n\n");

        Car3 car3 = new Car3();

        for (int i= 0; i<=4; i++){
            int problemLocation = car3.run();

            if(problemLocation !=0){
                System.out.println(car3.tires[problemLocation ].location+" HankookTire로 교체");
                car3.tires[problemLocation ] = new HankookTire((car3.tires[problemLocation -1].location), 15);
            }

            System.out.println("----------------------------------------------");

        }
    }
}
