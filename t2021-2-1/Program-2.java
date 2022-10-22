import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		int i=1;
		while(count<num) {
			if(i%2==1) {
				count++;
				System.out.print(i+" ");
			}
			i++;
		}
	}
}