import java.util.Scanner;

public class Main {
    
    



    public static void main(String[] args) {  
        
            System.out.print("What is your favorite fruit");
            Scanner Fruit = new Scanner(System.in);
            Scanner NumberOfFruit = new Scanner(System.in);
            String favFruit = Fruit.nextLine();
            int Num1 = NumberOfFruit.nextInt();
            for(int i = 0; i<Num1; i++){
            System.out.println( "your favorite fruit is " + favFruit +"!");
        }
        
            
    }
    
}
