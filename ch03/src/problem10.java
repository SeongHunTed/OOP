public class problem10 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int count = 0;
        int a,b = 0;

        for(int i =0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) arr[i][j] = 0;
        }

        while (count < 10){
            a = (int)(Math.random()*4);
            b = (int)(Math.random()*4);
            int value = (int)(Math.random()*10+1);
            if(arr[a][b] == 0){
                arr[a][b] = value;
                count++;
            }
        }

        for(int i =0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
