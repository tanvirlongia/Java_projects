class Palindrome 
{
    public static void main(String[] args) 
    {
  
      String initial_str = "MOM";
      String reverse_str = "";
      
      int length = initial_str.length();
  
      for (int i = (length - 1); i >=0; --i) 
      {
        reverse_str = reverse_str + initial_str.charAt(i);
      }
  
      if (initial_str.toLowerCase().equals(reverse_str.toLowerCase())) 
      {
        System.out.println(initial_str + " is a Palindrome");
      }
      else 
      {
        System.out.println(initial_str + " is not a Palindrome");
      }
    }
  }