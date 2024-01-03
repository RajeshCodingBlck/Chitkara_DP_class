package DP_online_class;

import java.util.Arrays;

public class Count_in_Matrix {
    
	public static int MazeProblem(int curr_r, int curr_c, 
			                      int des_r,  int des_c , int [][] dp) {
	  
	  if(curr_r== des_r && curr_c == des_c) { // +ve Base Case
		  
		  return 1;
	  }
	  
	  if(curr_r > des_r || curr_c > des_c) {
		  
		  return 0;
	  }
	   
	  if(dp[curr_r][curr_c] !=-1) {
		  
		  return dp[curr_r][curr_c];
	  }
	  
		
		int chhota_ans1=MazeProblem(curr_r, curr_c+1, des_r, des_c, dp);
		int chhota_ans2=MazeProblem(curr_r+1, curr_c, des_r, des_c, dp);
		
		int mera_ans= chhota_ans1+chhota_ans2;
		
		return dp[curr_r][curr_c]=mera_ans;
		

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int [][] dp= new int [4][3];
		
		for(int i=0; i<4;i++) {
			
			Arrays.fill(dp[i], -1);
		}
		int ans=MazeProblem(0,0,3,2 , dp);
		System.out.println(ans);
	}

}
