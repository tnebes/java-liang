public class CopyingArrays {
	public static void main(String[] args) {

		// copying an array using a loop.

		int[] sourceArray = {2, 3, 1, 5, 10};
		int[] targetArray = new int[sourceArray.length];

		for (int i = 0; i < sourceArray.length; i++) {
			targetArray[i] = sourceArray[i];
		}

		// copying an array using arraycopy

		int[] sourceArray0 = {2, 3, 1, 5, 10};
		int[] targetArray0 = new int[sourceArray0.length];

		System.arraycopy(sourceArray0, 0, targetArray0, 0, sourceArray0.length);



	}
}

