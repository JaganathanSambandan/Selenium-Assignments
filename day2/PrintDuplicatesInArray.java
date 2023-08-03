package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int a=arr.length, count;
		for(int i=0;i<=a-1;i++)
		{
			count=0;//why do we use this count variable?
			for(int j=i+1;j<=a-1;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Matching elements are " +arr[i]);
				}
			}
		}
	}

}
