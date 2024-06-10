import java.util.Scanner;


class Array2 
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

                
		int max = numbers[0];
        
		int min = numbers[0];

        
        
		for (int i = 1; i < numbers.length; i++) 
		{
            
			if (numbers[i] > max) 
			{
                
				max = numbers[i];
            
			}
            
			if (numbers[i] < min) 
			{
                
				min = numbers[i];
            
			}
        
		}

      
        
		System.out.println("Maximum value: " + max);
        
		System.out.println("Minimum value: " + min);

        
		scanner.close();
    
	}

}