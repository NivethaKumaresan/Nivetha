class Array13 
{
    
	public static void main(String[] args) 
	{
        
		if (args.length != 4) 
		{
            
			System.out.println("Please enter 4 integer numbers");
            			return;
        
		}

              
		int[][] array = new int[2][2];
        
		int k = 0;
        
		for (int i = 0; i < 2; i++) 
		{
            
			for (int j = 0; j < 2; j++) 
			{
                
				array[i][j] = Integer.parseInt(args[k++]);
            
			}
        
		}

                
		System.out.println("Original array:");
        
		printArray(array);

        
        
		int[][] reversedArray = new int[2][2];
        
		for (int i = 0; i < 2; i++) 
		{
            
			for (int j = 0; j < 2; j++) 
			{
                
				reversedArray[i][j] = array[1 - i][1 - j];
            
			}
        
		}

        
        
		System.out.println("Reversed array:");
        
		printArray(reversedArray);
    
	}

    
	private static void printArray(int[][] array) 
	{
        
		for (int[] row : array) 
		{
            
			for (int num : row) 
			{
                
				
				System.out.print(num + " ");
            
			}
            
			System.out.println();
        
		}
    
	}

}