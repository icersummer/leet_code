package problem169;

import java.util.HashMap;
import java.util.Iterator;

/**
 * https://leetcode.com/problems/majority-element/
 *
 */
public class Solution {
    public int majorityElement(int[] num) {
		int expected = 0 ;
		HashMap<String, Integer> map = new HashMap();
		for(int i : num) {
			String k = i+"";
			if(map.containsKey(k)){
				map.put(k, map.get(k)+1);
			} else {
				map.put(k, 1);
			}
		}
		int size = num.length;
		Iterator<String> keyit = map.keySet().iterator();
		while(keyit.hasNext()) {
			String key = keyit.next();
			int n = map.get(key);
			if(n*2 > size) {
				expected = Integer.valueOf(key);
				break;
			}
		}
		return expected;
	
    }
}