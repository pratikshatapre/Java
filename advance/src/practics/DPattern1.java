package practics;

public class DPattern1 {
	public static void printPattern(int donky)
    {
        int i, j;
         
        for (i = 1; i <= donky; i++) {
         
            for (j = 1; j <= donky - i; j++) {
                System.out.print(" ");
            }      
            
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

        

	public static void main(String args[])
    {
//        int n = 6;
        printPattern(6);// call
    }
}




