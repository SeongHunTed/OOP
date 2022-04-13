import java.util.Scanner;

public class problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c = 0;
        System.out.print("첫 번째 정수입력 : ");
        a = sc.nextInt();
        System.out.print("두 번째 정수입력 : ");
        b = sc.nextInt();
        System.out.print("세 번째 정수입력 : ");
        c = sc.nextInt();

        if(a>b&&a<c || a<b&&a>c){
            System.out.println("중간 값은 " + a);
        } else if(b>a&&b<c||b<a&&b>c){
            System.out.println("중간 값은 " + b);
        } else{
            System.out.println("중간 값은 " + c);
        }

        sc.close();
    }
}
