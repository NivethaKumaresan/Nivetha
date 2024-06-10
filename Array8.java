import java.util.Scanner;


class Array8 
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

                
		int sum = calculateSum(numbers);

        
        
		System.out.println("Sum: " + sum);

        
		scanner.close();
    
	}

    
	private static int calculateSum(int[] arr) 
	{
        
		int sum = 0;
        
		boolean ignore = false;

        
		for (int num : arr) 
		{
            
			if (num == 6) 
			{
                
				ignore = true;
            
			}
            
			if (!ignore) 
			{
                
				sum += num;
            
			}
            
			if (num == 7 && ignore) 
			{
                
				ignore = false;
            
			}
        
		}
        
		return sum;
    
	}

}