// 삽입 삭제 모두 보기 종료

import java.util.Scanner;

abstract class Shape{
    private Shape next;
    public Shape(){ next = null;}

    public void setNext(Shape obj) {
        this.next = obj;
    }

    public Shape getNext() {
        return next;
    }
    public abstract void draw();
}

class Line extends Shape{
    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

public class GraphicEditor {

    private Shape Head, Tail;
//    private Scanner sc;

    GraphicEditor(){
        Head = null;
        Tail = null;
//        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        GraphicEditor g = new GraphicEditor();
        g.formain();
    }

    public void formain() {
        System.out.println("그래픽 에디터 beauty를 시작합니다");
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >>");
            int a = sc.nextInt();
            switch (a){
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3) >>");
                    a = sc.nextInt();
                    add(a);
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치 >>");
                    a = sc.nextInt();
                    delete(a);
                    break;
                case 3:
                    showAll();
                    break;
                case 4:
                    System.out.print("beauty를 종료합니다");
                    sc.close();
                    return;
                default:
                    System.out.println("Wrong Input");
                    return;
            }
        }

    }

    private void add(int input){
        Shape s;
        switch (input){
            case 1:
                s = new Line();
                break;
            case 2:
                s = new Rect();
                break;
            case 3:
                s = new Circle();
                break;
            default:
                System.out.println("Wrong Input");
                return;
        }
        // 링크드 리스트 Head -> node -> tail
        if(Head == null){
            Head = s;
            Tail = s;
        } else {
            Tail.setNext(s);
            Tail = s;
        }
    }

    private void delete(int posit){
        int i;
        Shape s = Head;
        Shape temp = Head;
        if(posit == 1){
            if(Head == Tail){
                Head = null;
                Tail = null;
                return;
            } else {
                Head = Head.getNext();
                return;
            }// 다음 노드가 Head
        }
        for(i = 1; i<posit; i++){
            temp = s;
            s = s.getNext();
            if(s == null){
                System.out.println("삭제할 수 없습니다.");
                return;
            }
        }
        if(i == posit){
            temp.setNext((s.getNext()));
            Tail = temp;
        } else {
            temp.setNext(s.getNext());
        }


    }

    private void showAll(){
        Shape s = Head;
        while(s != null){
            s.draw();
            s= s.getNext();
        }
    }
}
