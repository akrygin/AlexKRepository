package MyFirstPackage;

public class MySecondClass {
	private int first;
	private int second;
	
	public MySecondClass(int f, int s) {
		first = f;
		second = s;
	}
	public int getFirst() {
		return first;
	}
	public int getSecond() {
		return second;
	}
	public void setFirst(int v) {
		first = v;
	}
	public void setSecond(int v) {
		second = v;
	}
	public int multFS() {
		return first * second;
	}
}