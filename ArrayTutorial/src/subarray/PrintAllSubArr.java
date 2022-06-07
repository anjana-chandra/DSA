package subarray;

public class PrintAllSubArr {

	public static void main(String[] args) {
		int[] arr = {2,1,3,5};
		for(int s=0;s<arr.length;s++) {
			for(int e=s;e<arr.length;e++) {
				for(int i=s;i<=e;i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}
			System.out.println("---");
		}
	}
	// tc=O(n3), sc=O(1)
}
