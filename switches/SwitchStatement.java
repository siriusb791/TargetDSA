package switches;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruits = sc.next();


        switch(fruits){
            case "Mango":
                System.out.println("National fruit of India");
                break;
            case "Orange":
                System.out.println("Round Fruit");
                break;
            case "Apple":
                System.out.println("An apple a day keeps doctor away");
                break;
            case "Banana":
                System.out.println("Its a long fruit");
                break;
            default:
                System.out.println("Sorry... Please, enter a valid fruit name");
        }



    }
}
