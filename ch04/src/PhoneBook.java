import java.util.Scanner;

class Phone{
    private String name;
    private String tel;

    Phone(){
        this(null, null);
    }

    Phone(String name, String tel){
        this.name = name;
        this.tel = tel;
    }

    public String getName(){
        return this.name;
    }

    String getTel(){
        return tel;
    }

}

class PhoneBook{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Phone p[];

        System.out.print("인원수 >> ");
        int num = sc.nextInt();
        p = new Phone[num];
        for(int i = 0; i < num; i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력 >>");
            String name = sc.next();
            String tel = sc.next();
            p[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");

        while(true){
            System.out.print("검색할 이름 >> ");
            String srcName = sc.next();

            if(srcName.equals("그만")) break;

            for(int i = 0; i < num; i++){
                if(p[i].getName().equals(srcName)){
                    System.out.println(p[i].getName() + "의 번호는 " + p[i].getTel() + " 입니다");
                    break;
                }
                if (i == num -1)
                    System.out.println(srcName + "이 없습니다");
            }


        }
    }
}

