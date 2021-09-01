package ch09;

public class Math1 {
	public static void main(String[] args) {
		double d1 = 4.1, d2 = 4.7, d3 = -4.1, d4 = -4.7;
		System.out.print("round : " + Math.round(d1) + "\t");
		System.out.print("ceil : " + Math.ceil(d1) + "\t");
		System.out.print("floor : " + Math.floor(d1) + "\t");
		System.out.println("rint : " + Math.rint(d1));
		
		System.out.print("round : " + Math.round(d2) + "\t");
		System.out.print("ceil : " + Math.ceil(d2) + "\t");
		System.out.print("floor : " + Math.floor(d2) + "\t");
		System.out.println("rint : " + Math.rint(d2));
		
		System.out.print("round : " + Math.round(d3) + "\t");
		System.out.print("ceil : " + Math.ceil(d3) + "\t");
		System.out.print("floor : " + Math.floor(d3) + "\t");
		System.out.println("rint : " + Math.rint(d3));
		
		System.out.print("round : " + Math.round(d4) + "\t");
		System.out.print("ceil : " + Math.ceil(d4) + "\t");
		System.out.print("floor : " + Math.floor(d4) + "\t");
		System.out.println("rint : " + Math.rint(d4));
//		round - 반올림
//		ceil - 천장 : 현재 숫자보다 큰 정수중에서 가장 가까운 정수
//		floor - 마루 : 현재 숫자보다 작은 정수중에서 가장 가까운 정수
//		rint - 현재 숫자에서 가까운 정수
	}
}
