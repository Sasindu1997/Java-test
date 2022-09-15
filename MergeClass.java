public class Main
{
	public static void main(String[] args) {
		int a = 0, b = 0, c = 1, sum = 0;
        
        for(int i = 1; i <= 100; i++)
        {
            a = b;
            b = c;
            c = a + b;
    
            sum = sum + a;
        }
        System.out.print("sum =  " + sum);
	}
}
