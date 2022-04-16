import java.util.Scanner;

public class problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int [] score = {95, 88, 76, 62, 55};

        int i = 0;

        while(true){
            System.out.print("과목 이름>>");
            String s = sc.next();
            for(i=0; i< course.length; i++){
                if(course[i].equals(s)){
                    System.out.println(course[i] + "의 점수는 " + score[i]);
                    break;
                }
            }
            if(s.equals("그만")) break;
            if(i == course.length) {
                System.out.println("없는 과목입니다.");
            }
        }

        sc.close();
    }
}
