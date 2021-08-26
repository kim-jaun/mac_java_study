package ch06;

public class Fact1 {
	public static void main(String[] args) {
		int[] nums = {3, 4, 5, 6, 7};
		for (int num : nums) {
			System.out.print(num + " 계승 : ");
			System.out.println(fat(num));
		}
		System.out.println("=============");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " 계승 : ");
			System.out.println(fat2(nums[i]));
		}
	}

	private static int fat2(int num) {
		if (num == 1) return 1;
		else return num * fat2(--num);
	}

	private static int fat(int num) {
		int result = 1;
		for (int i = num; i > 0; i--) {
			result *= i;			
		}
		return result;
	}
}
