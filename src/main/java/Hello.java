public class Hello {
	
	
    public static void main(String[] args) {
        System.out.println("Hello, World!");
       

        int[] ia = new int[101];
        for (int i = 0; i < ia.length; i++) ia[i] = i;
        int sum = 0;
        for (int e : ia) sum += e;
        System.out.println(sum);
        
        
        
        
    }
}