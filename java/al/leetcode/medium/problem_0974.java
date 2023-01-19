/**
 * Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.
 * A subarray is a contiguous part of an array.
 * 
 * Example 1:
 * Input: nums = [4,5,0,-2,-3,1], k = 5
 * Output: 7
 * Explanation: There are 7 subarrays with a sum divisible by k = 5:
 * [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
 * 
 * Example 2:
 * Input: nums = [5], k = 9
 * Output: 0
 */

package al.leetcode.medium;

public class problem_0974 {

    public int solution(int[] nums, int k) {
        int[] mods = new int[k];
        int sum = 0;
        for (int num : nums) {
            sum += num;
            int mod = sum % k;
            if (mod < 0) {
                mod += k;
            }
            mods[mod]++;
        }
        int result = mods[0];
        for (int i = 0; i < mods.length; i++) {
            result += (mods[i] * (mods[i] - 1)) / 2;
        }
        return result;
    }
    
}
