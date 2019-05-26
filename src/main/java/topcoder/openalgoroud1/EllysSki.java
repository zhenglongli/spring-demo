package topcoder.openalgoroud1;

public class EllysSki {
	
	public int getMax(int[] height) {
		
		int count = 0;
		int tempcount = 1;
		
		for (int i = 0; i < height.length; i++) {
			if (height[i] >= height[i+1]) {
				tempcount++;
			} else {
				if (count < tempcount) {
					count = tempcount;
				}
				
			}
		}
		
		return 0;
	}

}
