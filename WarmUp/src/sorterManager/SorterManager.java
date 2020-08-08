package sorterManager;

import java.util.List;

import algorithms.SortingAlgotithm;

public class SorterManager {

	SortingAlgotithm sorterAlgorithms;

	public SorterManager() {
		super();
	}

	public SorterManager(SortingAlgotithm sorterAlgorithms) {
		super();
		this.sorterAlgorithms = sorterAlgorithms;
	}

	public List<Integer> Sort(List<Integer> inputList, SortingAlgotithm algorithm) throws Exception {

		setSorterAlgorithms(algorithm);

		if (getSorterAlgorithms() == null) {
			throw new Exception("No sorting algorithm was found");
		}

		getSorterAlgorithms().sort(inputList);
		return inputList;

	}
	
	public List<Integer> sort(List<Integer> inputList) throws Exception {

		if (getSorterAlgorithms() == null) {
			throw new Exception("No sorting algorithm was found");
		}

		getSorterAlgorithms().sort(inputList);
		return inputList;

	}

	public SortingAlgotithm getSorterAlgorithms() {
		return sorterAlgorithms;
	}

	public void setSorterAlgorithms(SortingAlgotithm sorterAlgorithms) {
		this.sorterAlgorithms = sorterAlgorithms;
	}

}
