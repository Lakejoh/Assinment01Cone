import java.util.Scanner;

public class Main {
    
    



    public static void main(String[] args) {  
            System.out.print("What is your favorite fruit?");
            Scanner Fruit = new Scanner(System.in);
            int num1 = Integer.parseInt(args[0]);
            String favFruit = Fruit.nextLine();
            for(int i = 0; i<num1; i++){
            System.out.println( "your favorite fruit is " + favFruit +"!");
        }
        
            
    }
    
}
