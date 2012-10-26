package MyArray;

public class MyArray {

	private float[] arrs;

	public MyArray(int v) {
		setArrs(new float[v]);
	}

	public float[] getArrs() {
		return arrs;
	}

	public void setArrs(float[] arrs) {
		this.arrs = arrs;
	}

	public int countEl() {
		int count = 0;
		for (int i = 0; i < this.arrs.length; i++)
			count++;
		return count;
	}
	
	public int arrMax(){
		int x = 0;
		for (int i = 0; i < this.arrs.length; i++)
			if (this.arrs[x]<this.arrs[i]) 
				x=i;
		return x;
	}
	
	/*public void arrSort() {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}*/
}
