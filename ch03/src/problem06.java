import java.util.Scanner;

public class problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int charge = sc.nextInt();

        int [] uint = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        for(int i = 0; i<uint.length; i++){
            int count = charge/uint[i];
            if(count > 0){
                System.out.println(uint[i] + "원 짜리 : " + count);
                charge = charge%uint[i];
            }
        }
        sc.close();
    }
}
