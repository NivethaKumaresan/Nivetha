import java.util.Scanner;


class Array14 
{
    
	public static void main(String[] args) 
	{
        
		Scanner scanner = new Scanner(System.in);

        
        
		int[][] array = new int[3][3];

            
		System.out.println("Enter 9 integer numbers:");
        
		for (int i = 0; i < 3; i++) 
		{
            
			for (int j = 0; j < 3; j++) 
			{
                
				array[i][j] = scanner.nextInt();
            
			}
        
		}

        
        
		System.out.println("The given array is:");
        
		for (int i = 0; i < 3; i++) 
		{
            
			for (int j = 0; j < 3; j++) 
			{
                
				System.out.print(array[i][j] + " ");
            
			}
            
			System.out.println();
        
		}

             
		int max = array[0][0];
        
		for (int i = 0; i < 3; i++) 
		{
            
			for (int j = 0; j < 3; j++) 
			{
                
				if (array[i][j] > max) 
				{
                    
					max = array[i][j];
                
				}
            
			}
        
		}

                
		System.out.println("The biggest number in the given array is " + max);

        		scanner.close();
    
	}

}