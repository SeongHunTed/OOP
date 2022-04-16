import java.util.Scanner;

public class problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 몇개?");
        int num = sc.nextInt();
        int [] arr = new int[num];

        for(int i = 0; i<num; i++){
            arr[i] = (int)(Math.random()*100+1);
            for(int j = 0; j<i; j++){
                if(arr[i] == arr[j]){
                    i--;
                }
            }
        }

        for(int i = 0; i<num; i++){
            System.out.print(arr[i] + " ");
            if((i>0)&&(i%10 == 0)) System.out.println();
        }
        sc.close();
    }
}
