
public class Problem_4 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int[] b= {1,2,8,9,12,46,76,82,15,20,30};
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			int num=a[i];
			for(int j=0;j<b.length;j++) {
				if(b[j]%num==0) {
					count++;
				}
			}
			System.out.print(num+": "+count+", ");
		}
	}
}
