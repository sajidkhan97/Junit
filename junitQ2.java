//max min finder Q2

package junitque2;

public class FindMaxMinFinder2 {

	public  static int findMin(int a1[]) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] < min) {
				min = a1[i];
			}
		}
		return min;
	}

	public static int findMax(int a1[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] > max) {
				max = a1[i];
			}
		}
		return max;
	}
}

/// max min finder q2 test
package junitque2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMaxMinFinderTest2 {
	
	 int[] array = new int[] {56,34,7,3,54,3,34,34,53};
	
	
	@Test
    public void testMin() {
        int minValue = FindMaxMinFinder2.findMin(array);
        assert(minValue == 3);
    }
	@Test
    public void testMax() {
        int maxValue = FindMaxMinFinder2.findMax(array);
        assert(maxValue == 56);
    }
	
	
}