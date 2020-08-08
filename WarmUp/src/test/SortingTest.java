package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import algorithms.BubbleSort;
import algorithms.SortingAlgotithm;
import sorterManager.SorterManager;

public class SortingTest {

	@Test
	public void bubbleSortTest() throws Exception {

		List<Integer> expectedList = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));

		List<Integer> list1 = getShuffledList();
		SorterManager sorter = getSorter(new BubbleSort());

		list1 = sorter.sort(list1);

		chequearSolucion(list1, expectedList);
	}

	public void chequearSolucion(List<Integer> resultadoDelSorting, List<Integer> esperado) {
		assertTrue(esperado.equals(resultadoDelSorting));

	}

	private SorterManager getSorter(SortingAlgotithm algorithm) {
		return new SorterManager(algorithm);
	}

	private List<Integer> getShuffledList() {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		Collections.shuffle(list);
		return list;
	}
}
