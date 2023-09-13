package LuckyGuess;
import java.util.*;

public class LuckyGuess {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attemp = 10;
        Random random = new Random();
        int randomNumber = random.nextInt(101); 
//        int randomNumber =4;    
        int userNbr;
        System.out.println("You have "+attemp+" attempt !");
        System.out.println("guess the number between 0 and 100 : ");
        userNbr = scanner.nextInt();
        
        if(userNbr == randomNumber){
            System.out.println("Oooh, You nailed it at the first time !,Confrats ✨🎉🎊 !\n the number was "+ userNbr);
            }else{
                if(userNbr >randomNumber){
                    System.out.println("The number you type is supperior than the Anounymous number!");
                }else{
                    System.out.println("The number you type is inferior than the Anounymous number!");
                }
                attemp--;
                System.out.println("You still have "+attemp+" attempt !!");
                System.out.println("Try again : ");
               
               while (true){
                    if (attemp>0){
                        int newNbr;
                        newNbr = scanner.nextInt();
                       if(newNbr == randomNumber){
                           System.out.println("Congrats, the number was : "+randomNumber);
                           break;
                       }else{
                           if(newNbr >randomNumber){
                               System.out.println("The number you type is supperior than the Anounymous number!");
                           }else{
                               System.out.println("The number you type is inferior than the Anounymous number!");
                           }
                           attemp--;
                           System.out.println("You still have "+attemp+" attempt !!");
                           System.out.println("Try again : ");
                       }
                   }else{
                       System.out.println("You lose !");
                       break;
                   }
               }
            }
       
        
    }
    
    
    
    
}
