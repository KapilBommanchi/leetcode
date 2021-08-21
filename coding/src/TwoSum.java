import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * �* return two indices from an array, which sum to given target value. �*
 * �* @author kapil.bommanchi �* �
 */
public class TwoSum {
	private List<List<Integer>> getIndices(int[] intArray, int targetValue) {
		List<List<Integer>> intNestedList = new ArrayList<>();
		Map<Integer, Integer> intMap = new HashMap<>();
		int diff = 0;
		for (int i = 0; i < intArray.length; i++) {
			diff = targetValue - intArray[i];
			if (intMap.containsKey(diff)) {
				List<Integer> intList = new ArrayList<>();
				intList.add(intMap.get(diff));
				intList.add(i);
				intNestedList.add(intList);
			}
			intMap.put(intArray[i], i);
		}
		return intNestedList;
	}

	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		int[] intArray = new int[] { 1, 2, 3, 4, 2, -6, 10 };
		System.out.println(twoSum.getIndices(intArray, 4).toString());
	}
}