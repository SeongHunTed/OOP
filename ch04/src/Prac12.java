import java.util.Scanner;

class Booking{

    private Scanner sc;
    private String s[];
    private String a[];
    private String b[];

    Booking(){
        sc = new Scanner(System.in);
        s = new String[10];
        a = new String[10];
        b = new String[10];
        for(int i = 0; i < 10; i++){
            s[i] = "___";
            a[i] = "___";
            b[i] = "___";
        }
    }

    static void showLine(String line[]){
        for(int i = 0; i < 10; i++){
            System.out.print(" " + line[i] + " ");
        }
        System.out.println();
    }
    
    void showAll(){
        System.out.print("S >> ");
        Booking.showLine(s);
        System.out.print("A >> ");
        Booking.showLine(a);
        System.out.print("B >> ");
        Booking.showLine(b);
        System.out.println("<<< 조희를 완료하였습니다. >>>");
    }

    void bookName(String line[]){
        System.out.print("이름 >>");
        String name = sc.next();
        while(true){
            System.out.print("번호 >>");
            int num = sc.nextInt() - 1;
            if(line[num].equals("___")){
                line[num] = name;
                break;
            } else {
                System.out.println("이미 예약된 좌석입니다.");
            }
        }
    }

    void reserveSeat(){
        while(true){
            System.out.print("좌석 구분 S(1), A(2), B(3)>>");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.print("S>>");
                    showLine(s);
                    bookName(s);
                    return;
                case 2:
                    System.out.print("A>>");
                    showLine(a);
                    bookName(a);
                    return;
                case 3:
                    System.out.println("B>>");
                    showLine(b);
                    bookName(b);
                    return;
            }
        }
    }

    void delete(String seat[]){
        System.out.print("이름>>");
        String name = sc.next();
        for(int i = 0; i < 10; i++){
            if(name.equals(seat[i])){
                seat[i] = "___";
                break;
            }
        }
    }

    void cancel(){
        while(true){
            System.out.print("좌석 S:1, A:2, B:3 >>");
            int line = sc.nextInt();
            switch(line){
                case 1:
                    System.out.print("S>>");
                    showLine(s);
                    delete(s);
                    return;
                case 2:
                    System.out.print("A>>");
                    showLine(a);
                    delete(a);
                    return;
                case 3:
                    System.out.print("B>>");
                    showLine(b);
                    delete(b);
                    return;
                default:
                    System.out.println("올바른 숫자만 입력하세요 >> ");

            }
        }
    }

}

public class Prac12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("명품 콘서트홀 예약 시스템 입니다");
        Booking b = new Booking();
        while(true) {
            System.out.print("예약 : 1, 조회 : 2, 취소 : 3, 끝내기 : 4 >> ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    b.reserveSeat();
                    break;
                case 2:
                    b.showAll();
                    break;
                case 3:
                    b.cancel();
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("올바른 숫자를 입력해주세요.");
            }
        }

    }
}
