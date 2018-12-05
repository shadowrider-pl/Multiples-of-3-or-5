package finbarre.Multiplesof3or5;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public int solution(int number) {
		int sum = 0;
		Set<Integer> s = new HashSet<Integer>();

		for (int i = 1; i < number; i++) {
			if (i % 3 == 0 || (i % 5 == 0 && i % 3 != 0)) {
				s.add(i);
			}
		}
		sum = s.stream().mapToInt(Integer::intValue).sum();
		return sum;
	}

}
