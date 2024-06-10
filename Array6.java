import java.util.Arrays;

import java.util.Scanner;


class Array6 
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

        
        
		Arrays.sort(numbers);

        
        
		System.out.println("Sorted array:");
        
		for (int number : numbers) 
		{
            
			System.out.print(number + " ");
        
		}

        
		scanner.close();
    
	}

}