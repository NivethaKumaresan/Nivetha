import java.util.Scanner;


class Array1 
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
        
               
		int sum = 0;
        
		for (int num : numbers) 
		{
            
			sum += num;
        
		}
        
        
        
		double average = (double) sum / size;
        
        
        		System.out.println("Sum: " + sum);
        
		System.out.println("Average: " + average);
        
        
		scanner.close();
    
	}

}