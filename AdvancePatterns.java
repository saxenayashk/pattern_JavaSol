public class AdvancePatterns {
    public static void alphabetSquareRow(int n)
    {
        int i=1;
        char ch='A';

        while(i<=n)
        {
            int j=1;
            while(j<=n)
            {
                System.out.print(ch+" ");
                j++;
            }
            System.out.println();
            ch++;
            i++;
        }
    }
    public static void alphabetSquarePatt(int n)
    {
        int i=1;
        char ch='A';
        while(i<=n)
        {
            
            int j=1;
            while(j<=n)
            {
                System.out.print(ch+" ");
                ch++;
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void alphabetSquarePatt2(int n)
    {
        int i=1;
        
        while(i<=n)
        {
            
            int j=1;
            while(j<=n)
            {
                
                System.out.print((char)('A'+i+j-2)+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void leftTriangleAlphaPatt(int n)
    {
        int i=1;
        char ch='A';

        while(i<=n)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print(ch+" ");
                j++;
                ch++;
            }
            System.out.println();
            i++;
        }
    }
    public static void leftTriangleAlphaPatt2(int n)
    {
        int i=1;
        while(i<=n)
        {
            char ch=(char)('A'+n-i);
            int j=1;
            while(j<=i)
            {
                System.out.print(ch+" ");
                ch++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void rightTriangleStarPatt(int n)
    {
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=n-i)
            {
                System.out.print(" ");
                j++;
            }
            int k=1;
            while(k<=i)
            {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }
    public static void rightTriangleStarPatt2(int n)
    {
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=n-i+1)
            {
              System.out.print("*");
              j++;
            }
            int k=1;
            while(k<=i-1)
            {
                System.out.print(" ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
    public static void rightTriangleStarPatt3(int n)
    {
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=i-1)
            {
                System.out.print(" ");
                j++;
            }
            int k=1;
            while(k<=n-i+1)
            {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }
    public static void rightTriangleNumPatt(int n)
    {
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=i-1)
            {
                System.out.print(" ");
                j++;
            }
            int k=1;
            while(k<=n-i+1)
            {
                System.out.print(i);
                k++;
            }
            i++;
            System.out.println();
        }
    }
    public static void rightTriangleNumPatt2(int n)
    {
        int i=1;
        int x=1;
        while(i<=n)
        {
            int j=1;
            while(j<=n-i)
            {
                System.out.print("  ");
                j++;
            }
            int k=1;
            while(k<=i)
            {
                System.out.print(x+" ");
                x++;
                k++;
            }
            System.out.println();
            i++;
        }
    }
    public static void pyramidNumPattern(int n)
    {
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=n-i)
            {
                System.out.print("  ");
                j++;
            }
            int k=1;
            while(k<=i)
            {
                System.out.print(k+" ");
                k++;
            }
            int l=2;
            while(l<=i)
            {
                int res=l-1;
                if(res>0)
                {
                    System.out.print(res+" ");
                }
                l++;
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String[] args) {
       alphabetSquareRow(5); 
       System.out.println("----------------"); 
       alphabetSquarePatt(5);     
       System.out.println("-------------------"); 
       alphabetSquarePatt2(5);
       System.out.println("-------------------"); 
       leftTriangleAlphaPatt(5);
       System.out.println("-------------------"); 
       leftTriangleAlphaPatt2(5);
       System.out.println("-------------------"); 
       rightTriangleStarPatt(5);
       System.out.println("-------------------"); 
       rightTriangleStarPatt2(5);
       System.out.println("---------------------");
       rightTriangleStarPatt3(5);
       System.out.println("------------------------");
       rightTriangleNumPatt(5);
       System.out.println("------------------------");
       rightTriangleNumPatt2(5);
       System.out.println("------------------------");
       pyramidNumPattern(5);

    }
    /*
     OUTPUT:-
     
     A A A A A 
     B B B B B 
     C C C C C 
     D D D D D 
     E E E E E 
     ----------------
     A B C D E 
     F G H I J 
     K L M N O 
     P Q R S T 
     U V W X Y 

     -------------------
     A B C D E 
     B C D E F 
     C D E F G 
     D E F G H 
     E F G H I
     -------------------
     A 
     B C 
     D E F 
     G H I J 
     K L M N O 

     -------------------
     E 
     D E 
     C D E 
     B C D E 
     A B C D E 

     -------------------
       *
      **
     ***
    ****
   *****

    -------------------
    *****
    **** 
    ***  
    **   
    *   

    ---------------------
    *****
     ****
      ***
       **
        *

    ------------------------
    11111
     2222
      333
       44
        5    

    ------------------------
        1 
      2 3 
    4 5 6 
  7 8 9 10 
11 12 13 14 15 

    ------------------------
        1 
      1 2 1 
    1 2 3 1 2 
  1 2 3 4 1 2 3 
1 2 3 4 5 1 2 3 4 
     */
}
