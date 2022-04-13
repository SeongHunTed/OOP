import java.util.Scanner;

public class problem08 {

    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2){
        if((x>= rectx1 && x <= rectx2) && (y >=recty1 && y <= recty2))
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rectx1 =100;
        int recty1 = 100;
        int rectx2= 200;
        int recty2 = 200;
        int x1, x2, y1, y2 = 0;

        System.out.print("직사각형의 한 점 x1, y1을 입력하세요 : ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.print("직사각형의 나머지 점 x2, y2을 입력하세요 : ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        if(inRect(x1,y1, rectx1, recty1, rectx2, recty2) == true || inRect(x2, y2, rectx1, recty1, rectx2, recty2) == true){
            System.out.println("기존 직사각형 (100,100), (200, 200)과 충돌합니다!");
        } else System.out.println("기존 직사각형 (100,100), (200,200)과 충돌하지 않습니다!");

        sc.close();

    }
}
