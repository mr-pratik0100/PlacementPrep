

public class MajorityElement {

	public static void main(String[] args) {
		
		int arr[]= {3,3,3,4,4,4,4,4,4,1,2};
		int n=10;
		
		int ma=arr[0];
		int count=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==ma) {
				count++;
			}else {
				count--;
			}
			if(count==0) {
				ma=arr[i];
				count=1;
			}
		}
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(ma==arr[i]) {
				c++;
			}
		}
		if(c>(n/2)) {
			System.out.println(c);
		}else {
			System.out.println("majority element not found");
		}
