import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1, y1;
        int x2, y2;
        double diam1, diam2;

        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        diam1 = sc.nextDouble();
        System.out.print("두번째 원의 중심과 반지름 입력>>");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        diam2 = sc.nextDouble();

        double distance = Math.sqrt(((x1 - x2)*(x1 - x2)) + ((y1 - y2))*(y1 - y2));

        if(distance <= diam1 + diam2){
            System.out.println("두 원은 서로 겹친다");
        } else System.out.println("두 원은 서로 겹치지 않는다");

        sc.close();
    }
}
