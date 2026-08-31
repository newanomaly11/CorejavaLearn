package secondweek;

public class Assgn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {15,67,34,98,101,200};
		
		int max=a[0];
				
		for( int i=0; i<a.length ; i++) {
			if(a[i]>max)
			{
				max=a[i];
			}
		}
			System.out.println("Maximum value from array is  "+ max);
		
		
	

  }

}
