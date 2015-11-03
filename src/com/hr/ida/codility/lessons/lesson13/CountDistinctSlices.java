package com.hr.ida.codility.lessons.lesson13;

import java.util.HashMap;
import java.util.Map;

//Caterpillar method
public class CountDistinctSlices {

	public int solution(int M, int[] A) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int result = 0;
		int lastIndex = -1;
		for (int i = 0; i < A.length; i++) {
			int preOccurIndex = map.containsKey(A[i]) ? map.get(A[i]) : -1;
			lastIndex = Math.max(preOccurIndex, lastIndex);
			result += i - lastIndex;
			if (result >= 1000000000) {
				return 1000000000;
			}
			map.put(A[i], i);
		}
		return result;
	}


}
