import java.io.PrintStream;
import java.util.Scanner;

class Booking{

    private Scanner sc;
    private String s[];
    private String a[];
    private String b[];

    Booking(){
        s = new String[10];
        a = new String[10];
        b = new String[10];
        for(int i = 0; i < 10; i++){
            s[i] = "---";
            a[i] = "---";
            b[i] = "---";
        }
    }

    void showLine(){
        for(int i = 0; i < 10; i++){
            System.out.println();
        }
    }
    
    void showAll(){
        System.out.println("S >> " + s);
        System.out.println("A >> " + a);
        System.out.println("B >> " + b);
    }

}

public class Prac12 {

    public static void main(String[] args) {
        Booking a = new Booking();
        a.show();
    }
}
