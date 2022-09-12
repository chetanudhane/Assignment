package Day3;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElements {

	public static void main(String[] args) {
		int[] a = { 1, 5, 3, 4, 2, 2, 6, 8, 1, 2 };
		int n = a.length;

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (a[j] == a[i]) {
					count++;
				}
			}
			System.out.println(a[i] + ":" + count);
		}
		System.out.println();

		Map<Integer, Integer> obj = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (obj.get(a[i]) == null) {
				obj.put(a[i], 1);
			} else {
				int count = obj.get(a[i]) + 1;
				obj.put(a[i], count);
			}
		}
		System.out.println(obj.toString());

	}

}
