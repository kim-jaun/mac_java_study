package ch11;

public class GenericE<T> {
	T[] v;
	public void set(T[] v) {
		this.v = v;
	}
	public void print() {
		for(T s : v) {
			System.out.println(s);
		}
	}
}
