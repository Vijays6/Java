package com.vj.practice;

import java.util.Arrays;

public class QuickSortAlgorithm {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		quickSort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int[] arr, int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}
		int pivotIndex = highIndex;
		int pivot = arr[highIndex];
		swap(arr, pivotIndex, highIndex);

		int pi = partition(arr, lowIndex, highIndex, pivot);
		quickSort(arr, lowIndex, pi - 1);
		quickSort(arr, pi + 1, highIndex);
	}

	public static int partition(int[] arr, int lowIndex, int highIndex, int pivot) {
		int left = lowIndex;
		int right = highIndex - 1;

		while (left < right) {
			while (arr[left] <= pivot && left < right) {
				left++;
			}
			while (arr[right] >= pivot && left < right) {
				right--;
			}
			swap(arr, left, right);
		}
		if (arr[left] > arr[highIndex]) {
			swap(arr, left, highIndex);
		} else {
			left = highIndex;
		}
		return left;
	}

	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
