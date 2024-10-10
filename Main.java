import java.util.Scanner;

public class Main {
    
    



    public static void main(String[] args) {  
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("What is your favorite fruit");
            String fruit = scanner.nextLine();
            System.out.println( "your favorite fruit is" + fruit);
        }
        
            
    }
    
}
