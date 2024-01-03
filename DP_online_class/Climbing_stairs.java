package DP_online_class;

import java.util.Arrays;

public class Climbing_stairs {
   
	// nth Stairs->0th Stairs taak jane ka count. 
	public static int climbing_Stairs(int n, int [] brain) { 
		
		
		if(n<0) {
			
			return 0;
		}
		
		if(n==0) {
			
			return 1;
		}
		
		if(brain[n] != -1) {
			
			return brain[n];
		}
		
		int chhota_ans1= climbing_Stairs(n-1, brain);
		int chhota_ans2= climbing_Stairs(n-2, brain);
		
		int mera_ans= chhota_ans1+ chhota_ans2;
		
		return  brain[n]=mera_ans;
	}
	
	public static int Tabulation(int n) {
		
		int [] dp= new int [n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2; i<dp.length;i++) {
			dp[i]= dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] brain= new int[10];
         
         Arrays.fill(brain, -1);
		System.out.println(climbing_Stairs(4, brain));
		
	}

}
