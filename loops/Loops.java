package loops;

public class Loops {
    public static void main(String[] args) {

        int[] arr = {5,3,2,4,1};
        int n = arr.length;
        for(int i=0;i<n;i++){
            for (int j = i+1; j < n-1; j++) {
                System.out.print(i+" "+j+"  ");


            }
            System.out.println();
        }
    }
}
