import java.util.Arrays;

import java.util.Scanner;


class Array7 
{
    
	public static void main(String[] args) 
	{
        
		Scanner scanner = new Scanner(System.in);

   
        
		System.out.print("Enter the size of the array: ");
        
		int size = scanner.nextInt();

                
		int[] numbers = new int[size];

        
        
		System.out.println("Enter the elements of the array:");
        
		for (int i = 0; i < size; i++) 
		{
            
			numbers[i] = scanner.nextInt();
        
		}

  
        
		numbers = removeDuplicates(numbers);

        
        
		System.out.println("Array without duplicates:");
        
		for (int number : numbers) 
		{
            
			System.out.print(number + " ");
        
		}

        
		scanner.close();
    
	}

        
	private static int[] removeDuplicates(int[] arr) 
	{
        
		int n = arr.length;
        
		if (n == 0 || n == 1) 
		{
            
			return arr;
        
		}

        
		int[] temp = new int[n];
        
		int j = 0;

        
		Arrays.sort(arr);

        
		for (int i = 0; i < n - 1; i++) 
		{
            
			if (arr[i] != arr[i + 1]) 
			{
                
				temp[j++] = arr[i];
            
			}
        
		}

        
		temp[j++] = arr[n - 1];

        
		int[] result = new int[j];
        
		System.arraycopy(temp, 0, result, 0, j);

        
		return result;
    
	}

}