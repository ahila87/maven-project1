package com.ahila.project.maven;

public class Finder {

	 public static int findMax(int[] intArray){  
		 System.out.println(intArray);
		    if(intArray == null || intArray.length == 0) return 0;
		  
	        int max = intArray[0];  
	        for(int i=1;i<intArray.length;i++){  
	            if(max<intArray[i])  
	                max=intArray[i];  
	        }  
	   	 System.out.println(max);
	        return max;  
		    
	    } 
	 
	 public static int findMin(int[] intArray){  
		 System.out.println(intArray);
		 if(intArray == null || intArray.length == 0) return 0;
		 int min = intArray[0];  
	        for(int i=1;i<intArray.length;i++){  
	            if(min>intArray[i])  
	                min=intArray[i];  
	        }  
	    	System.out.println(min);
	        return min;  
	    }  

}
	