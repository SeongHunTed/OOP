import java.util.Scanner;

public class problem12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        String c;

        System.out.print("연산>>");
        a = sc.nextDouble();
        c = sc.next();
        b = sc.nextDouble();

        if(c.equals("+")){
            System.out.println(a + c + b + "의 계산 결과는 "+(a+b));
        } else if(c.equals("-")){
            System.out.println(a + c + b + "의 계산 결과는 "+(a-b));
        } else if(c.equals("*")){
            System.out.println(a + c + b +"의 계산 결과는 "+(a*b));
        } else {
            if(b == 0){
                System.out.println("0으로 나눌 수 없습니다.");
            } else {
                System.out.println(a + c + b + "의 계산결과는 "+(a/b));
            }
        }
        sc.close();
    }
}
