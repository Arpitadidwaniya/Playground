import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
      String st = scan.nextLine();
   //StringBuilder sb = new StringBuilder(str); // Copying input string to sb (StringBuilder)
    String temp = new String(""); // empty StringBuilder
    int n= str.length(); 
       int m = st.length(); 
      temp=(str.concat(str));
      int u = temp.length();
      int c=0;
    for(int i= 0; i < n ; i++ )
    {c=0;
      for(int j=0;j<m;j++)
      {
      if(temp.charAt(i+j)!= st.charAt(j))
      {c=1;}
    }
      if(c==0)
      { System.out.println("Yes");
      break;}
    }
      if(c==1)
      {
        System.out.println("No");
      }
}
}