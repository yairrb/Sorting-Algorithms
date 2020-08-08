package algorithms;

import java.util.List;

import interfaces.Sorter;

public class BubbleSort extends SortingAlgotithm {

	// average O(n^2) BubbleSort
	private void bubbleSort(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() ; j++) {
				if (list.get(j) < list.get(j + 1)) {
					int tempValue = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, tempValue);
				}
			}
		}
	}

	// Bubble sort optimized
	private void bubbleSortOptimized(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {

			for (int j = i; j < list.size(); j++) {

				if (list.get(i) < list.get(j)) {

					int tempValue = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tempValue);
				}
			}
		}
	}

	@Override
	public void sort(List<Integer> list) {

		this.bubbleSortOptimized(list);
	}

}
