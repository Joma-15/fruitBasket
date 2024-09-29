import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

public class fruitBasket {

    static Scanner scanner = new Scanner(System.in);
    static Stack<String> basket = new Stack<>();

    //for the quantity of the fruit
    static int fruitQuantity(){
        while (true) {
            System.out.print("How many fruit you want to catch? : ");
            int fruitQuan = scanner.nextInt();
            scanner.nextLine();

            try {
                return fruitQuan;//retruning the food number user want to catch
            } catch (InputMismatchException e) {
                System.out.println("Invalid input try again!");
                continue;
            }
        }
    }
    //asking the food that want to catch
    static String pickFruit(){
      while(true){
        System.out.print("Which fruit you want to catch? : ");

        switch (scanner.nextLine().toUpperCase()) {
            case "A": return "Apple";
            case "O": return "Orange";
            case "M": return "Mango";
            case "G": return "Guava";
            default: System.out.println("Invalid input try again");continue;
        }
      }
    }
    //adding the food to the basket
    static void addFruit(int fruitQuantity){
        for (int i = 0; i < fruitQuantity; i++) {
            basket.push(pickFruit());
        }
    }
    //display the fruit list
    static void displayFruit(Stack<String> basket){
        System.out.println("\n----FRUIT CURRENT VALUE------");
        for (String fruit : basket) {
            System.out.println(fruit);
        }
    }
    //pop the element in the stack
    static void eatFruit(Stack<String> basket, String eating){
      while (true) {
        if (basket.size() > 0 && eating.equalsIgnoreCase("e")) {
            try {//simulating the process of eating with 50 millisec delay for the printing of each character
                String eatingProcess = "eating.................";
                for (char eat : eatingProcess.toCharArray()) {
                    System.out.print(eat);
                    TimeUnit.MILLISECONDS.sleep(50);
                }
                basket.pop();
                displayFruit(basket);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("\nTheir is no fruit available in the basket");
            System.exit(0);
        }
      }
    }
    public static void main(String[] args) {
        System.out.println("-------FRUIT SHOP--------");
        addFruit(fruitQuantity());// first para val is the type of fruit and the second is the quantity of the fruit
        displayFruit(basket);

        System.out.print("Do you want to eat the fruit? : ");
        String e = scanner.nextLine();
        eatFruit(basket, e);
    }
}