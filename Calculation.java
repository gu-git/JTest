package com.junit.project;

public class Calculation {
	 public static int findMax(int arr[]){  
	        int max=arr[0];  
	        for(int i=1;i<arr.length;i++){  
	            if(max<arr[i])  
	                max=arr[i];  
	        }  
	        return max;  
	    }  
	    
	    public static int add(int a, int b) {
	     return a + b;
	     }
	    
	     public static int sub(int a, int b) {
	     return a - b;
	     }
}
