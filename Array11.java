import java.util.Scanner;


class Array11 
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

             
		boolean result = only14(numbers);

             
		System.out.println("Result: " + result);

        
		scanner.close();
    
	}

    
	private static boolean only14(int[] arr) 
	{
        
		for (int num : arr) 
		{
            
			if (num != 1 && num != 4) 
			{
                
				return false;
            
			}
        
		}
        
		return true;
    
	}

}