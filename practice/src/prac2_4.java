import java.util.Scanner;

public class prac2_4 {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 공백으로 분리하여 입력!");
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        System.out.print("name : " + name + " ");

        String city = sc.next();
        System.out.print("city : " + city + " ");

        int age = sc.nextInt();
        System.out.print("age : " + age + " ");

        double weight = sc.nextDouble();
        System.out.print("weight : "+ weight + " ");

        boolean single = sc.nextBoolean();
        System.out.println("marriage : "+ single + " ");

        sc.close();
    }
}
