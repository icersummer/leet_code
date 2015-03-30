package problem_two_sum;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/two-sum/
Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, 
where index1 must be less than index2. 
Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
 */
public class Solution {
	
    public int[] twoSum(int[] numbers, int target) {
        
    	// key - the number; value - number's array index
    	Map<Integer, Integer> numberMap = new HashMap();
    	int idx= 0;
    	for(int i: numbers){
    		numberMap.put(new Integer(i), idx++);
    	}
    	
    	int index1 = 0;
    	int len = numbers.length;
    	int index2 = 0;
    	while(index1 <= len-1){
    		int diff = target - numbers[index1];
    		Integer idx_ = numberMap.get(new Integer(diff));
    		if(idx_ != null && idx_.intValue() > index1){
    			index2= idx_.intValue();
    			break;
    		}
    		index1++;
    	}
    	
    	return new int[]{index1+1, index2+1};
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	int[] is = s.twoSum(new int[]{2, 7, 11, 15}, 9);
		System.out.println(is[0] + ", " + is[1]);
    	is = s.twoSum(new int[]{3,2,4}, 6);
		System.out.println(is[0] + ", " + is[1]);
		
	}
}