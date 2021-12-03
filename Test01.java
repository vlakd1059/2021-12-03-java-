package 자바테스트;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("X 입력 >> ");
		int num2 = sc.nextInt();

		int arr[] = new int[num1];
		for (int i = 0; i < num1; i++) {
			System.out.print((i+1) + "번째 정수 입력 >> ");
			int num3 = sc.nextInt();
			if (num3 < num2) {
				arr[i] = num3;
			} else {
				arr[i] = 0;
			}

		}
		System.out.print("결과 >> ");
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
