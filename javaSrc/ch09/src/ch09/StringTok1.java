package ch09;
import java.util.StringTokenizer;
public class StringTok1 {
	public static void main(String[] args) {
		StringTokenizer st1 = 
				new StringTokenizer("a,d,f,g,a,s,d");
		while(st1.hasMoreTokens()) {
			System.out.println();
		}
	}
}
