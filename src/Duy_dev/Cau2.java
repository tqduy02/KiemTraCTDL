package Duy_dev;

import java.util.Arrays;

public class Cau2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Số phần tử chẵn trong mảng: " + demPhanTuChan(arr));
		System.out.println("Kiểm tra mảng có được sắp xếp tăng dần: " + kiemTraSapXep(arr));
		System.out.println("Số phần tử có giá trị từ 4 đến 12: " + demGiaTri(arr, 4, 12));
		System.out.println("Tổng các phần tử của mảng: " + tinhTong(arr));
		System.out.println("Tổng các phần tử lẻ: " + tongLe(arr));
		bubbleSort(arr);
		System.out.println("Bubble Sort: " + Arrays.toString(arr));
		System.out.println("Gia trị lớn nhất: " + timMax(arr));
	}

	// a
	public static int demPhanTuChan(int[] arr) {
		int dem = 0;
		for (int x : arr) {
			if (x % 2 == 0) {
				dem++;
			}
		}
		return dem;
	}

	// b
	public static boolean kiemTraSapXep(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				return false;
			}
		}
		return true;
	}

	// c
	public static int demGiaTri(int[] arr, int min, int max) {
		int dem = 0;
		for (int x : arr) {
			if (x >= min && x <= max) {
				dem++;
			}
		}
		return dem;
	}

	// d
	public static int tinhTong(int[] arr) {
		int tong = 0;
		for (int x : arr) {
			tong += x;
		}
		return tong;
	}

	// e
	public static int tongLe(int[] arr) {
		int tongle = 0;
		for (int x : arr) {
			if (x % 2 != 0) {
				tongle += x;
			}
		}
		return tongle;
	}

	// f
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	// g
	public static int timMax(int[] arr) {
		int max = arr[0];
		for (int x : arr) {
			if (x > max) {
				max = x;
			}
		}
		return max;
	}
}