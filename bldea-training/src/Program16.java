import java.util.Scanner;

/**
 * 
 */

/**
 * @author hp
 *
 */
public class Program16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  value of n");
		int n =sc.nextInt();
		//to print I
	        for( int i=0;i<n;i++) {
			for(int j=0;j<n;j++){
				if(i==0 && j<=(n/2) || i==(n-1)&& j<=(n/2) || j==(n/4) ) {
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
			}
			System.out.print("  ");
		// to print L	
			for(int j=0;j<n;j++){
				if(j==0 || i==(n-1) && j<(n/2)  ) {
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
				}	
			// to print o	
			for(int j=0;j<n;j++) {
				if((j==0 && i!=0 && i!=(n-1) )|| (i==0 && j!=0 && j<(n/2) ) || (j==(n/2) && i!=0 &&  i!=(n-1)) || j!=0 && i==(n-1) && j<(n/2) ) {
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
				}
			// to print v
			for(int j=0 ;j<n;j++) {
				if(i==j && j<=(n/2) && i>(n/2) )  {
					System.out.print("* ");}
				else {
					System.out.print("  ");		
				}
			}
			// to print E
			for(int j=0;j<n ;j++){
				if(j==0 || i==0 && j<=(n/2) ||i==(n-1) && j<=(n/2) || i==(n/2) && j<(n/2)){
					System.out.print("* ");}
				else {
					System.out.print("  ");		
				}
				}
			System.out.print(" ");
			// to print M
			for(int j=0;j<n;j++){
				if(j==0 || j==(n-1) || (i==j && i<=(n/2)) || (i+j==(n-1) && i<=(n/2)) ) {
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
			}	
			// to print Y
			for(int j=0 ;j<n;j++) {
				if(i+j==(n-1) || (i==j && i<=(n/2))){
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
				}
			System.out.print(" ");
			// to print I
			for(int j=0;j<n;j++){
				if(i==0 && j<=(n/2) || i==(n-1)&& j<=(n/2) || j==(n/4) ) {
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
			}
			// to print N
			for(int j=0 ;j<n;j++) {
				if(j==0 || i==j || j==(n-1)) {
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
			}
			// to print D
			for(int j=0;j<n;j++) {
				if(j==0 || (i==0 && j<(n/2)) || (i==(n-1) && j<(n/2)) || (j==(n/2) && i!=0 && i!=(n-1))) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");	}
			}
			// to print I
			for(int j=0;j<n;j++){
				if(i==0 && j<=(n/2) || i==(n-1)&& j<=(n/2) || j==(n/4) ) {
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
			}
			// to print A
			for(int j=0;j<n;j++){
				if((i==0 && j!=0  && j!=(n-1))|| (j==0  && i!=0) || j==(n-1) && i!=0  || i==(n/2)) {
					System.out.print("* ");}
				else {
					System.out.print("  ");	
				}
			}			
			System.out.println();
	}
}
		}
