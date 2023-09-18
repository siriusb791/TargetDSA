package recursion;

public class ProductDigit {
    public static void main(String[] args) {
        System.out.println(product(1230));
    }

    static int product(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*product(n/10);
    }
}
