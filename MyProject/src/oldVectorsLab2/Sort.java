package oldVectorsLab2;

/**
 * Static class for sort arrays
 * 
 * @author Krygin A.N.
 * @version 1.0
 */
class Sort {
	
	/**
	 *  Static method for sorting vector 
	 *  @param args takes vector from class MyArray and do sorting
	 *  @return void
	 */
	public static void arrSort(MyArray args) {
		for (int i = 0; i < args.countEl(); i++) {
			for (int j = 0; j < args.countEl(); j++) {
				if (args.getElem(i) < args.getElem(j)) {
					double tmp = args.getElem(i);
					args.setElem(i, args.getElem(j));
					args.setElem(j, tmp);
				}
			}
		}
	}
}
