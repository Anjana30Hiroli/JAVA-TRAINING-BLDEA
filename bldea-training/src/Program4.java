/**
 * 
 */

/**
 * @author hp
 *
 */
import java.util.Scanner;
public class Program4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age :");
		int age =sc.nextInt();
		if(age<18) {
			System.out.println("you are still a minor,please grow up");
		}
		else if(age>65) {
			System.out.println("you are a senior citizen,stop over expectations");
		}
		else {
			System.out.println("Congratulations you are in the list of most eligible groom");
		}

	}

}
