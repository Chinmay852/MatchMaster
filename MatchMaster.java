import java.util.Scanner;
import java.util.Random;

public class MatchMaster {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int userInput = sc.nextInt();

    Random rm = new Random();
    int computerInput = rm.nextInt(10);


        if(userInput==computerInput){
        System.out.println("You Win!, It seems you are a pro in guessing.");
    }
    else{
        System.out.println("You lost, Better Luck Next Time");
    }
    System.out.println("Computer Value: " + computerInput);
     sc.close();
}
    }    

