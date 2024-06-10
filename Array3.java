import java.util.Scanner;


class Array3 
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

             
		System.out.print("Enter the number to search: ");
        
		int searchNumber = scanner.nextInt();

        
        
		int index = -1;
        
		for (int i = 0; i < size; i++) 
		{
            
			if (numbers[i] == searchNumber) 
			{
                
				index = i;
                
				break;
            
			}
        
		}

              
		if (index == -1) 
		{
            
			System.out.println("-1");
        
		} 
		else 
		{
            
			System.out.println("Index of " + searchNumber + " is: " + index);
        		}

        
		scanner.close();
    
	}

}