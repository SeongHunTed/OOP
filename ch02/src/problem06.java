import java.util.Scanner;

public class problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int num = sc.nextInt();
        int a = 1;
        int b = num%10; //일의 자리
        if(num>=10) {
            a = num / 10; //십의 자리
            if(num%10 == 0) {
                b = -1;
            }
        }


        if(a%3 == 0 && b%3 == 0) {
            System.out.println("박수짝짝");
        } else if (a%3 == 0 || b % 3 == 0) {
            System.out.println("박수짝");
        }

        sc.close();
    }
}
