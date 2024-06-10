import java.util.Scanner;


class Array4 
{
    
	public static void main(String[] args) 
	{
        
		Scanner scanner = new Scanner(System.in);

                
		System.out.print("Enter the size of the array: ");
        
		int size = scanner.nextInt();

                
		int[] asciiValues = new int[size];

               
		System.out.println("Enter the ASCII values:");
        
		for (int i = 0; i < size; i++) 
		{
            
			asciiValues[i] = scanner.nextInt();
        
		}

             
		System.out.println("Corresponding characters:");
        
		for (int asciiValue : asciiValues) 
		{
            
			System.out.print((char) asciiValue + " ");
        
		}

        
		scanner.close();
    
	}

}