package mypackage;
import java.util.Scanner ;
class Factors {
	private int num ;
	
	public Factors(int num) {
		this.num = num ;
	}
	
	public void getFactors() {
		System.out.println("Factors of "+num+" are :");
		for (int i=1;i<num;i++) {
			if(num%i==0) {
				System.out.print(i+" ") ;
			}
		}
		System.out.println() ;
	}
	public void sumtillZero() {
		Scanner sc = new Scanner(System.in) ; 
		int negsum = 0 ;
		int evensum = 0 ;
		int oddsum = 0 ;
		while(true) {
			System.out.println("Enter a number:") ;
			int num = sc.nextInt() ;
			if (num<0) {
				negsum+=num ;
			}else if (num%2==0 && num>0) {
				evensum+=num ;
			}else if (num%2==1 && num>0){
				oddsum+=num ;
			}
			if (num == 0) {
				System.out.println("Negative Sum :"+negsum) ;
				System.out.println("Even positive sum:"+evensum) ;
				System.out.println("Odd positive sum:"+oddsum) ;
				break ;
				
			}
		}
	}
	public void reverseString() {
		Scanner obj1 = new Scanner(System.in) ;
		System.out.println("Enter a String :") ;
		String var = obj1.next() ;
		for (int i=var.length()-1 ; i >= 0 ; i--) {
			System.out.print(var.charAt(i)) ;
		}
		System.out.println() ;
	}
	public void daysCount() {
		int days = 31 ;
		int count = 0 ;
		for(int i = 1 ; i <= days ; i++) {
			if (i%2==0) {
				count++ ;
			}
		}
		System.out.println("Days kunal is allowed to go out in August :"+count) ;
	}
	public void findPrime() {
		Scanner obj2 = new Scanner(System.in) ;
		System.out.println("Enter a Number :") ;
		int num = obj2.nextInt() ;
		int count = 0 ;
		for (int i=1 ; i <=num ; i++) {
			if(num%i==0) {
				count++ ;
			}
		}
		if (count==2) {
			System.out.println("It is a prime number") ;
		}else {
			System.out.println("Not a prime number") ;
		}
	}
	public void isarmStrong() {
		Scanner obj3 = new Scanner(System.in) ;
		System.out.println("Enter a number:") ;
		int n = obj3.nextInt() ;
		int org=n ;
		int sum = 0 ;
		int count = 0 ;
		int temp=n ;
		while (temp != 0) {
			count ++ ;
			temp/=10 ;
		}
		temp=n ;
		while (temp != 0) {
			int digit = temp % 10 ;
			sum+=Math.pow(digit, count) ;
			temp/=10 ;
			 
		}
		if (org==sum) {
			System.out.println("It is armstrong") ;
		}
		else {
			System.out.println("Not armstrong") ;
		}

	}
}
public class Practice {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in) ; 
		System.out.println("Enter a number :") ;
		int inputnum = obj.nextInt() ;
		Factors a = new Factors(inputnum) ;
		a.getFactors() ;
		a.sumtillZero() ;
		a.reverseString() ;
		a.daysCount() ;
		a.findPrime() ;
		a.isarmStrong() ;
		
		
	
		
	}

}
