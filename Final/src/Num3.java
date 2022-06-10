class ChildException extends Exception{

}

class GrandChildException extends ChildException{

}

class ExceptionHandlingTest{

    public static void main(String[] args) {
        try{
            throw new GrandChildException();
        } catch (GrandChildException g){
            System.out.println("GCE");
        } catch (ChildException c){
            System.out.println("CE");
        }

        try{
            throw new GrandChildException();
        } catch (ChildException c){
            System.out.println("CE");
        }
    }
}


class Num3 {


}
