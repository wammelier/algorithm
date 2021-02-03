package algorithm;

import java.util.ArrayList;
import java.util.List;

// BFS 형식 템플릿
public class BFSAlgorithm {

	public static Integer binarySearch(final List<Integer> source, final Integer target, final Integer min, final Integer max) {

		// 상태값 설정
		Integer index = (min + max) / 2;
		// 종료 조건
		if (target.equals(source.get(index)))
			return index;

		return target < source.get(index) ? binarySearch(source, target, min, index - 1) : // 왼쪽
				binarySearch(source, target, index + 1, max); // 오른쪽
	}

	public static void main(final String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);

		System.out.println(binarySearch(nums, 5, 0, nums.size() - 1));
	}

}
