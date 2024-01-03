package DP_online_class;

public class fibonacci {
    
	public static int fibo(int n, int [] brain) { // Take n , give nth fibonacci
		  // Base case
		   if(n==0 || n==1) {
			   return n;
		   }
		   if(brain[n] !=0) {
			   return brain[n];
		   }
		  
		   
		   //System.out.println( "Hello World "+ n);
		   int chhota_ans1= fibo(n-1, brain ); // (n-1) -> (n-1)th fibo
		   int chhota_ans2= fibo(n-2, brain); // (n-2) -> (n-2)th fibo
		   int mera_ans= chhota_ans1+ chhota_ans2;
		   return  brain[n]=mera_ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int [] brain= new int [11];
		System.out.println(fibo(10, brain));
		
	}

}
