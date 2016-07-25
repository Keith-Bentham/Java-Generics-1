
class ArrayTest <T extends Number & Comparable<T>> {
	private T[] values;

	public ArrayTest(T[] v) {
		values = v;
	}

	public T first() throws Exception {
		if (values.length == 0)
			throw new Exception();
		return values[0];
	}

	public T max() throws Exception {
		if (values.length == 0)
			throw new Exception();
		T res = values[0];
		for (int i = 0; i < values.length; i++) {
			if (res.compareTo(values[i]) < 0)
				res = values[i];
		}
		return res;
	}

	public T sum() throws Exception {
		if (values.length == 0)
			throw new Exception();
		double res = values[0].doubleValue();
		for (int i = 0; i < values.length; i++) {
			res += values[i].doubleValue();
		}
		Number res1 = res;
		return (T) res1;
	}
	
	public void printAll() {
		System.out.println();
		System.out.print("[");
		for (int i = 0; i < values.length; i++)
			System.out.print("  " + values[i]);
		System.out.println("]");
	}
}
