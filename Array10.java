import java.util.Scanner;


class Array10 
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

        
        
		int[] result = evenOdd(numbers);

         
		System.out.println("Rearranged array:");
        
		for (int number : result) 
		{
            
			System.out.print(number + " ");
        
		}

        
		scanner.close();
    
	}

    
	private static int[] evenOdd(int[] arr) 
	{
        
		int[] result = new int[arr.length];
        
		int evenIndex = 0;
        
		int oddIndex = arr.length - 1;

         
		for (int num : arr) 
		{
            
			if (num % 2 == 0) 
			{
                
				result[evenIndex++] = num;
            
			} 
			else 
			{
                
				result[oddIndex--] = num;
            
			}
        
		}

      
       
        
		for (int i = 0; i < arr.length; i++) 
		{
            
			if (arr[i] % 2 != 0) 
			{
                
				result[evenIndex++] = arr[i];
            
			}
        
		}

        
		return result;
    
	}

}