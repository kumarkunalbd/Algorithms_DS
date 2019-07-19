package com.kunal.operations;

enum TraverseDirection{
	LEFT,
	RIGHT	
}

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
        if(arrayLenngth%2 != 0 ) {
        	if(differenceTillMidlength > 0) {
        		for (int i = midLenghtBreak+1; i > 0; i--) {
					if(i== midLenghtBreak+1) {
						differenceTillMidlength = differenceTillMidlength-nums[midLenghtBreak+1];
						if(differenceTillMidlength == 0) {
							break;
						}
					}else {
						differenceTillMidlength = differenceTillMidlength-(2*nums[i]);
						if(differenceTillMidlength == 0) {
							break;
						}
					}
				}
        		
        		if(differenceTillMidlength == 0) {
        			//pivotIdex = this.checkForLeftMostPresenceOfZero(i-1, 0, TraverseDirection.LEFT, nums);
        		}else {
        			pivotIdex = -1;
        		}
        		
        	}else if(differenceTillMidlength < 0) {
        		for (int i = midLenghtBreak+1; i < nums.length; i++) {
        			if(i == midLenghtBreak+1) {
        				differenceTillMidlength = differenceTillMidlength+nums[midLenghtBreak+1];
        				if(differenceTillMidlength ==0) {
        					break;  
        				}
        			}else {
        				differenceTillMidlength = differenceTillMidlength+(2*nums[i]);
        				if(differenceTillMidlength == 0) {
        					break;
        				}
        			}
					
				}
        		
        		if(differenceTillMidlength == 0) {
        			//pivotIdex = this.checkForLeftMostPresenceOfZero(startIndex, endIndex, direction, nums);
        		}
        		
        		
        		
        	}else if(differenceTillMidlength == 0){
        		
        	}
        }else if(arrayLenngth%2 ==0 && differenceTillMidlength%2==0) {
        	if(differenceTillMidlength > 0) {
        		int i=midLenghtBreak;
        		for(; i > 0 ; i--) {
        			differenceTillMidlength = differenceTillMidlength - (2*nums[i]);
        			if(differenceTillMidlength == 0) {
        				break;
        			}
        		}
        		if(differenceTillMidlength == 0) {
        			//pivotIdex = i-1;
        			int leftMostZeroIndex = this.checkForLeftMostPresenceOfZero(i-1, 0, TraverseDirection.LEFT, nums);
        			pivotIdex = leftMostZeroIndex;
        		}else {
        			pivotIdex = -1;
        		}
        	}else if(differenceTillMidlength < 0 ) {
        		int i = midLenghtBreak;
        		for ( i = midLenghtBreak+1; i < nums.length; i++) {
					differenceTillMidlength = differenceTillMidlength + (2*nums[i]);
					if(differenceTillMidlength == 0) {
						break;
					}
				}
        		
        		if(differenceTillMidlength == 0) {
        			int leftMostZeroIndex = this.checkForLeftMostPresenceOfZero(i+1, nums.length, TraverseDirection.RIGHT, nums);
        			pivotIdex = leftMostZeroIndex;
        		}else {
        			pivotIdex = -1;
        		}
        		
        	}else if(differenceTillMidlength == 0) {
        		int i=midLenghtBreak;
        		int leftMostZeroIndex = this.checkForLeftMostPresenceOfZero(i-1, 0, TraverseDirection.LEFT, nums);
        		pivotIdex = leftMostZeroIndex;
        		if(pivotIdex != -1) {
        			pivotIdex = this.checkForLeftMostPresenceOfZero(midLenghtBreak+1, nums.length, TraverseDirection.RIGHT, nums);
        		}
        	}
        }
        return pivotIdex;
    
	}
	
	/* Return index 0 is poresent in particular direction. else return -1*/
	public int checkForLeftMostPresenceOfZero(int startIndex, int endIndex, TraverseDirection direction, int[] nums) {
		int returnigZeroIndex = -1;
		if(direction == TraverseDirection.LEFT) {
			if(startIndex>= endIndex) {
				for (int i = startIndex; i >= endIndex; i--) {
					if(nums[i] == 0) {
						returnigZeroIndex = i;
					}
					if(returnigZeroIndex != -1 && nums[i]!= 0) {
						break;
					}
				}
			}
		}else {
			
			if(startIndex <= endIndex) {
				for (int i = startIndex; i < nums.length; i++) {
					if(nums[i]== 0) {
						returnigZeroIndex = i;
						break;
					}
				}
			}
			
		}
		return returnigZeroIndex;
	}

}
