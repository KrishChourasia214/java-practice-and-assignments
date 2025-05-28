package somethingidk;
import java.util.Scanner ;
class Codes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the first number :");
        int num1 = sc.nextInt() ;
        System.out.println("Enter the second number :");
        int num2 = sc.nextInt() ;
        System.out.printf("HCF of %d and %d :",num1,num2);
        int temp = 0 ;
        for(int i=1;i<=num1;i++) {
            if (num1%i==0 && num2%i==0) {
                 temp = i ;
             
            }
          
        }
        System.out.println(temp);
        System.out.printf("LCM of %d and %d :",num1,num2) ;
        for(int i = Math.max(num1, num2); ; i++) {    
            if (i % num1 == 0 && i % num2 == 0) {  
                temp = i;
                System.out.println(temp);
                break;  // Exit once the LCM is found
            }
            
        }
    }
}