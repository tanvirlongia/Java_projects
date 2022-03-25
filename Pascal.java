class Pascal
{
    public static void main(String[] args) 
    {
        int rows = 10;
        for (int i = 0; i < rows; i++) 
        { 
            int n = 1; 
            System.out.printf("%" + (rows - i) * 2 + "s", ""); 
            for (int j = 0; j <= i; j++) 
            { 
                System.out.printf("%4d", n); 
                n = n * (i - j) / (j + 1); 
            } 
            System.out.println(); 
        } 
    } 
}

