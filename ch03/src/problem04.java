import java.util.Scanner;
import java.lang.String;
public class problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        System.out.print("소문자 알파벳 하나를 입력하시오>>");

        String s = sc.next();
        char c = s.charAt(0);
        int count = 0;

        for(int i = 0; i<alpha.length; i++){
            if(c == alpha[i]) count = i;
        }

        for(int i = count; i>=0; i--){
            for(int j = 0; j<=i; j++){
                System.out.print(alpha[j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
