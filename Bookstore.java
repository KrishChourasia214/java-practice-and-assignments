package somethingidk;
import java.util.Scanner ;
class Bookstore {
	Scanner obj = new Scanner(System.in) ;
	private String title , author , publication ;
	private int quantity ;
	private float price ;
	
	public void setData() {
		System.out.println("Enter the title of Book :") ;
		title = obj.nextLine() ;
		System.out.println("Enter the name of Author :") ;
		author = obj.nextLine() ;
		System.out.println("Enter the publication of Book :") ;
		publication = obj.nextLine() ;
		System.out.println("Enter the quantity of Book :") ;
		quantity = obj.nextInt() ;
		System.out.println("Enter the price of Book :") ;
		price = obj.nextFloat() ;
		obj.nextLine() ; 
	}
	public void getData() {
		System.out.println("Book name :" + title) ;
		System.out.println("Author name :" + author) ;
		System.out.println("Book publication :" + publication) ;
		System.out.println("Total copies of Book :" + quantity) ;
		System.out.println("Total price of Book :" + price) ;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in) ;
		Bookstore book = new Bookstore() ;
		System.out.println("Enter the no. of books to be stored :-") ;
		int num = obj.nextInt() ;
		obj.nextLine() ;
		for (int i=1;i<=num;i++) {
			System.out.println("Enter the details of Book "+i+":-") ;
			book.setData() ;
			System.out.println("Details of the book "+i+":-") ;
			book.getData();
		}
		
		
	}
}
