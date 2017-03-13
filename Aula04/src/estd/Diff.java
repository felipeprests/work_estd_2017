package estd;

public class Diff {

	public int bigDiff(int[] nums) {

		int max = nums[0];
		int min = nums[0];

		for (int i : nums) {
			max = Math.max(max, i);
			min = Math.min(min, i);
		}
		
		return max - min;
	}

}
