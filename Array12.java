import java.util.Scanner;


class Array12 
{
    
	public static void main(String[] args) 
	{
        
		Scanner scanner = new Scanner(System.in);

           
		int[] a = new int[3];
        
		System.out.println("Enter the elements of the first array:");
        
		for (int i = 0; i < 3; i++) 
		{
            
			a[i] = scanner.nextInt();
        
		}

        
        
		int[] b = new int[3];
        
		System.out.println("Enter the elements of the second array:");
        
		for (int i = 0; i < 3; i++) 
		{
            
			b[i] = scanner.nextInt();
        
		}

            
		int[] result = middleWay(a, b);

        
        
		System.out.println("Resulting array:");
        
		for (int number : result) 
		{
            
			System.out.print(number + " ");
        
		}

        
		scanner.close();
    
	}

    
	private static int[] middleWay(int[] a, int[] b) 
	{
        
		return new int[]{a[1], b[1]};
    
	}

}