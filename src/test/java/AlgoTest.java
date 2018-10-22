package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {

	SortDemoData data = new SortDemoData();
	
	//checking if the item array is sorted or not
	
	public boolean isItemArraySorted(Item[] array) {
		for (int i = 0; i < array.length - 1; i++) {
	        if (array[i].key > array[i + 1].key) {
	            return false; // This proves that the array is not sorted.
	        }
	    }
		
		//This proves that the item array is sorted 
	    return true;
	}

	// This test function is the Node Coverage test case which covers 100 percent of the lines written in the code.
	@Test
	public void BasicArraySorting() { 
		
			//initializing the data array
		
		    data.initializeArray("11 2 4 5 9 23 32 52"); 
		    
		    //copying the given array into my testArray
		    
		    Item[] testArray = new Item[data.myArray.length];
		    
			System.arraycopy(data.myArray, 0, testArray, 0, data.myArray.length);
					   
			//Checking it for BubbleSort
		    SortAlgos.bubbleSort(data.myArray);
		    
		    
		    assertFalse("Previous item array should be unsorted",isItemArraySorted(testArray));
		    assertTrue(" bubble sort",isItemArraySorted(data.myArray));
		    
		    //Checking it for SelectionSort
			System.arraycopy(testArray, 0, data.myArray, 0, testArray.length);
			
			SortAlgos.selectionSort(data.myArray);
			
		    
		    assertFalse("Previous item array should be unsorted",isItemArraySorted(testArray));
		    assertTrue(" selection sort",isItemArraySorted(data.myArray));
		    
		    //Checking it for InsertionSort
			System.arraycopy(testArray, 0, data.myArray, 0, testArray.length);
			
			SortAlgos.insertionSort(data.myArray);
			
			
			assertFalse("Previous item array should be unsorted",isItemArraySorted(testArray));
			assertTrue(" insertion sort",isItemArraySorted(data.myArray));
			
			//Checking it for MergeSort
			System.arraycopy(testArray, 0, data.myArray, 0, testArray.length);
			
			SortAlgos.mergeSort(data.myArray);
			
			
			assertFalse("Previous item array should be unsorted",isItemArraySorted(testArray));
			assertTrue(" merge sort",isItemArraySorted(data.myArray));
			
			//Checking it for QuickSort
			System.arraycopy(testArray, 0, data.myArray, 0, testArray.length);
			
			SortAlgos.quickSort(data.myArray);
			
			
			assertFalse("Previous item array should be unsorted",isItemArraySorted(testArray));
			assertTrue(" quick sort",isItemArraySorted(data.myArray));


			//Checking it for HeapSort
			System.arraycopy(testArray, 0, data.myArray, 0, testArray.length);
			
			SortAlgos.heapSort(data.myArray);
			
			
			assertFalse("Previous item array should be unsorted",isItemArraySorted(testArray));
			assertTrue(" heap sort",isItemArraySorted(data.myArray));
			
	}
	
	
	//Testing the bubble sort extensively in the below test cases.
	
	/*
	@Test (expected=java.lang.NumberFormatException.class)
	public void TestForWrongElementArray() {
		data.initializeArray("2 55 6 p 33");  
	    
	    Item[] testArray = new Item[data.myArray.length];
		System.arraycopy(data.myArray, 0, testArray, 0, data.myArray.length);
	    SortAlgos.bubbleSort(data.myArray);
	    assertFalse("Previous item array should be unsorted",isItemArraySorted(testArray));
	    assertFalse(" bubble sort",isItemArraySorted(data.myArray));
	}
	
	*/
	
	
	@Test 
	public void TestForAllKindsOfElements() {
		data.initializeArray("-11 -2 -4 5 -9 -23 ");  
	    
	    Item[] testArray = new Item[data.myArray.length];
		System.arraycopy(data.myArray, 0, testArray, 0, data.myArray.length);
	    SortAlgos.bubbleSort(data.myArray);
	    assertFalse("Previous item array should be unsorted",isItemArraySorted(testArray));
	    assertTrue(" bubble sort",isItemArraySorted(data.myArray));
	}
	
	
	
	
	//This has Edge Coverage and Path Coverage
	
		@Test
		public void TestForNegativeElementArray() {
			data.initializeArray("-11 -2 -4 -5 -9 -23 -32 -52 -1 -55 -22");  
		    
		    Item[] testArray = new Item[data.myArray.length];
			System.arraycopy(data.myArray, 0, testArray, 0, data.myArray.length);
		    SortAlgos.bubbleSort(data.myArray);
		    assertFalse("Previous item array should be unsorted",isItemArraySorted(testArray));
		    assertTrue(" bubble sort",isItemArraySorted(data.myArray));
		}
	
	
	
	//This has Edge Coverage and Conditional Coverage
	
	@Test
	public void TestForASingletonSet() {
		
		//initializing with a single element
		data.initializeArray("42");
	    SortAlgos.bubbleSort(data.myArray);
	    assertTrue(" bubble sort",isItemArraySorted(data.myArray));
	}
	
	
	// Test to check the sort if it has repeating elements
	//Covers Edge Coverage and Node Coverage
	@Test
	public void TestBubbleSortworksIfItHasRepeatingElements() {
		 	data.initializeArray("12 32 22 3 4 5 12");  
		    
		    Item[] testArray = new Item[data.myArray.length];
			System.arraycopy(data.myArray, 0, testArray, 0, data.myArray.length);
		    SortAlgos.bubbleSort(data.myArray);
		    
		    assertFalse("Previous item array should be unsorted",isItemArraySorted(testArray));
		    assertTrue(" bubble sort",isItemArraySorted(data.myArray));
	}
	
	
	
	 

}
