package com.ahila.project.maven;

public class Finder {

	 public static int findMax(int[] intArray){  
		
		    if(intArray == null || intArray.length == 0) return 0;
		  
	        int max = intArray[0];  
	        for(int i=1;i<intArray.length;i++){  
	            if(max<intArray[i])  
	                max=intArray[i];  
	        }  
	   	 
	        return max;  
		    
	    } 
	 
	 public static int findMin(int[] intArray){  
		
		 if(intArray == null || intArray.length == 0) return 0;
		 int min = intArray[0];  
	        for(int i=1;i<intArray.length;i++){  
	            if(min>intArray[i])  
	                min=intArray[i];  
	        }  
	    	
	        return min;  
	    }  

}
	