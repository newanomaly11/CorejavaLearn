package secondweek;

public class PrimeNo100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//       i=4,  4<=100
		 for(int i=1 ; i<=100 ; i++)
		 {
			 // 4==1
			 if(i==1)
			 {
				 System.out.println(i+" is not prime number");
			 }
			 else
			 {
				 boolean flag=false;
				 //      j=2.  2<=2
				 for(int j=2 ; j<=i/2 ; j++) //prime number
				 {
					 // 0==0
					 if(i%j==0)
					 {
						 flag=true;
					 }
				 }
				 
			 
			 
			 if(flag==false) // flag==true, if we want to print not prime numbers
			 {
				 System.out.println(i+" is  prime number");
			 }
			 
		 }
		
		
		
		 }

	}

}
