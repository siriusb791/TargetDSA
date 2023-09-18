package recursion;

public class ProductNto1 {
    public static void main(String[] args) {
//        System.out.println(product(4));
        System.out.println(sum(5));

    }

    static int product(int n){
        if(n<1){
            return 1;
        }

        return n*product(n-1);
    }

    static int sum(int n){
        if(n<1){
            return 0;
        }
        return n+sum(n-1);
    }
}
