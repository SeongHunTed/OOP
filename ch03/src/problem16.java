import java.util.Scanner;

public class problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] str = {"가위", "바위", "보"};
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        while(true)
        {
            System.out.print("가위 바위 보!>>");
            String c;
            String s = sc.next();
            if(s.equals("그만")){
                System.out.println("게임을 종료합니다...");
                break;
            }
            int n = (int)(Math.random()*3);
            c = str[n];
            if(s.equals("가위"))
            {
                if(str[n].equals("가위")) System.out.println("사용자 = "+ s + ", 컴퓨터 = " + str[n] + " 비겼습니다.");
                else if(str[n].equals("바위")) System.out.println("사용자 = "+ s + ", 컴퓨터 = " + str[n] + " 컴퓨터가 이겼습니다.");
                else if(str[n].equals("보")) System.out.println("사용자 = "+ s + ", 컴퓨터 = " + str[n] + " 사용자가 이겼습니다.");
            }
            else if(s.equals("바위"))
            {
                if(str[n].equals("바위")) System.out.println("사용자 = "+ s + ", 컴퓨터 = " + str[n] + " 비겼습니다.");
                else if(str[n].equals("가위")) System.out.println("사용자 = "+ s + ", 컴퓨터 = " + str[n] + " 사용자가 이겼습니다.");
                else if(str[n].equals("보")) System.out.println("사용자 = "+ s + ", 컴퓨터 = " + str[n] + " 컴퓨터가 이겼습니다.");
            }
            else if(s.equals("보"))
            {
                if(str[n].equals("보")) System.out.println("사용자 = "+ s + ", 컴퓨터 = " + str[n] + " 비겼습니다.");
                else if(str[n].equals("바위")) System.out.println("사용자 = "+ s + ", 컴퓨터 = " + str[n] + " 사용자가 이겼습니다.");
                else if(str[n].equals("가위")) System.out.println("사용자 = "+ s + ", 컴퓨터 = " + str[n] + " 컴퓨터가 이겼습니다.");
            }
        }
    }
}
