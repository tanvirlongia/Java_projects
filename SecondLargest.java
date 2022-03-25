class SecondLargest
{ 
    public static int getSecondLargest(int[] a, int size)
    {  
    int temp;  
    for (int i = 0; i < size; i++)   
            {  
                for (int j = i + 1; j < size; j++)   
                {  
                    if (a[i] > a[j])   
                    {  
                        temp = a[i];  
                        a[i] = a[j];  
                        a[j] = temp;  
                    }  
                }  
            }  
           return a[size-2];  
    }  
    public static void main(String args[])
    {  
    int a[]={4,2,8,6,3,9,7};  
    System.out.println("The Second Largest Element is: "+getSecondLargest(a,7));  
    }
}  