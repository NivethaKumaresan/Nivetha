import java.util.Scanner;


class Array9 
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

               
		int[] result = withoutTen(numbers);

      
        
		System.out.println("Modified array:");
        
		for (int number : result) 
		{
            
			System.out.print(number + " ");
        
		}

        
		scanner.close();
    
	}

    
	private static int[] withoutTen(int[] arr) 
	{
        
		int[] result = new int[arr.length];
        
		int index = 0;

        
        
		for (int num : arr) 
		{
            
			if (num != 10) 
			{
                
				result[index++] = num;
            
			}
        
		}

                
		return result;
    
	}

}