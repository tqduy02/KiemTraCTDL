package Duy_dev;

public class Cau1 {
	public static int F(int n) {
		if (n <= 2) {
			return 1;
		} else {
			return F(n - 1) + F(n - 2);
		}
	}

	public static void main(String[] args) {
		int n = 8;
		int ketQua = F(n);
		System.out.println("F(" + n + ") = " + ketQua);
	}
}
