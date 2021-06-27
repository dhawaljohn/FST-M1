package Activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 77, 10, 54, -11, 10};
		int m=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==10) {
				m=m+a[i];
				}
			}
		if(m==30) {
			System.out.print("Sum of 10's is "+" " +m);
		}
		else {
			System.out.print("Sum of 10's is not equal to 30");
		}
	}

}
