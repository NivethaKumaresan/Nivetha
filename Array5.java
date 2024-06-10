import java.util.Scanner;


class Array5 
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

        
        
		int largest1 = Integer.MIN_VALUE;
        
		int largest2 = Integer.MIN_VALUE;
        
		for (int number : numbers) 
		{
            
			if (number > largest1) 
			{
                
				largest2 = largest1;
                
				largest1 = number;
            
			} 
			else if (number > largest2 && number != largest1) 
			{
                
				largest2 = number;
            
			}
        
		}

                
		int smallest1 = Integer.MAX_VALUE;
        
		int smallest2 = Integer.MAX_VALUE;
        
		for (int number : numbers) 
		{
            
			if (number < smallest1) 
			{
                
				smallest2 = smallest1;
                
				smallest1 = number;
            
			} 
			else if (number < smallest2 && number != smallest1) 
			{
                
				smallest2 = number;
            
			}
        
		}

        
        
		System.out.println("Largest two numbers: " + largest1 + ", " + largest2);
        		System.out.println("Smallest two numbers: " + smallest1 + ", " + smallest2);

        		scanner.close();
    
	}

}