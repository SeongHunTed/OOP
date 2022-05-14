import java.util.Scanner;

class Dictionary{
    private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String [] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String word){

        for(int i = 0; i < kor.length; i++){
            if(word.equals(kor[i])) {
                if (i % 2 == 0) {
                    System.out.print(word + "은 ");
                    return eng[i];
                } else {
                    System.out.print(word + "는 ");
                    return eng[i];
                }
            }
        }
        return "false";
    }
}

public class DicApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dictionary dic = new Dictionary();

        System.out.println("한영 단어 검색 프로그램입니다");

        while(true){
            String input;
            System.out.print("한글 단어?");
            input = sc.next();
            if(input.equals("그만")) break;
            String e = Dictionary.kor2Eng(input);
            if(e.equals("false"))
                System.out.println(input + "는 저의 사전에 없습니다.");
            else
                System.out.println(e);
        }

        sc.close();
    }
}
