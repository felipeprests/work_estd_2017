package estd;

import java.util.Iterator;

public class Even {
	
	
	public int countEvens(int[] nums) {
		int result  = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0)
				result++;
		}
		
		return result;
	}

}
