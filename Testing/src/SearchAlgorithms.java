
public class SearchAlgorithms {

	public static void main (String[] args)
	{
		int[] test1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] test2 = {0, 4, 5, 6, 12, 15, 17, 23, 29};
		
		System.out.println(binSearch(test1, 3));
		System.out.println(linSearch(test1, 3));
		
		System.out.println(binSearch(test2, 23));
		System.out.println(linSearch(test2, 23));
		
		System.out.println(binSearch(test2, 25));
		System.out.println(linSearch(test2, 25));
		
		System.out.println(binSearch(test1, 10));
		System.out.println(linSearch(test1, 1));
		
		System.out.println(binSearch(test1, 1));
	}
	
	public static int linSearch(int[] arr, int query)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == query)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int binSearch(int[] arr, int query)
	{
		int L = 0;
		int R = arr.length - 1;
		
		while (L <= R)
		{
			int mid = (int)(L + R) / 2;
			if (query == arr[mid])
			{
				return mid;
			}
			if (query < arr[mid])
			{
				R = mid;
			}
			if (query > arr[mid])
			{
				L = mid;
			}
		}
		return -1;
	}

}
