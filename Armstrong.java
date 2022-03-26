class Armstrong 
{
    public static void main(String args[]) 
    {
        int number = 407, num, r, end = 0;
        num = number;

        while (num != 0)
        {
            r = num % 10;
            end += Math.pow(r, 3);
            num /= 10;
        }

        if(end == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}