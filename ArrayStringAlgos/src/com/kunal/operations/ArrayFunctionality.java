package com.kunal.operations;

public class ArrayFunctionality {

	public int pivotIndex(int[] nums) {
		int pivotIdex = -1;
        int arrayLenngth = nums.length;
        int midLenghtBreak = (arrayLenngth/2)-1;
        //int counter = 0;
        int differenceTillMidlength = 0;
        for (int i = 0; i <= midLenghtBreak; i++) {
			differenceTillMidlength = differenceTillMidlength + nums[i]-nums[arrayLenngth-1-i];
		}
        if(arrayLenngth%2 != 0) {
        	
        }else {
        	if(differenceTillMidlength > 0) {
        		int i=midLenghtBreak;
        		for(; i > 0 ; i--) {
        			differenceTillMidlength = differenceTillMidlength - (2*nums[i]);
        			if(differenceTillMidlength == 0) {
        				
        				break;
        			}
        		}
        		if(nums[i-1]!=0) {
        			pivotIdex = i-1;
        		}
        	}else if(differenceTillMidlength < 0) {
        		
        	}else if(differenceTillMidlength == 0) {
        		
        	}
        }
        
        
        return pivotIdex;
    }

}
