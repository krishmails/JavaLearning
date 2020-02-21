
public class LargerValueArray {
	public static void main(String[] args)
	{
		int a[]= {28,3,15,19,17,4,23};
		for(int i=0;i<=a.length;i++) {
			for(int j=i+1;j<i;j++) {
				
			
			if(a[i]>a[j]) {
				System.out.println("The largest value in the array is"+a[i]);
			}
				else {
					System.out.println(a[j]+"is the largest value");
				}
			
			}
		
		}
		
		}
}

		
		
	


