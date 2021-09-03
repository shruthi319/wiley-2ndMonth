import java.util.Arrays;

public class ProgramC {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,5,7,8,9};
		int sum=10;
		Arrays.sort(arr);
		int j=1;
		int i=0;
		while(i<arr.length & j<arr.length) {
			if(arr[i]+arr[j]==sum) {
				System.out.println(arr[i]+" "+arr[j]);
			}
			if(arr[i]+arr[j]<sum) {
				j++;
			}
			else {
				i++;
				j++;
			}
		}
		System.out.println("************************");
		i=0;
		j=arr.length-1;
		while(i<arr.length && j>0 && i<j) {
			if(arr[i]+arr[j]==sum) {
				System.out.println(arr[i]+" "+arr[j]);
			}
			if(arr[i]+arr[j]>sum) {
				j--;
			}
			else {
				i++;
			}
		}
	}

}
