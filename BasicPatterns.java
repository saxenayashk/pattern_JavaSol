public class BasicPatterns {
    public static void squareBoxStar(int n)
    {

      int i=1;
      while(i<=n)
      {
        int j=1;
        while(j<=n)
        {
            System.out.print("*");
            j=j+1;
        }
        System.out.println();
        i=i+1;
      }
    }
    public static void squareBoxNumRow(int n)
    {
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=n)
            {
                System.out.print(i+" ");
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
    public static void squareBoxNumCol(int n)
    {
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=n)
            {
                System.out.print(j+" ");
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
    public static void reverseSquareBoxNumCol(int n)
    {
        int i=1;
        while(i<=n)
        {
            int j=n;
            while(j>=1)
            {
                System.out.print(j+" ");
                j=j-1;
            }
            System.out.println();
            i=i+1;
        }
    }
    public static void squareBoxNum(int n)
    {
        int ch=1;
        int i=1;
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
    public static void leftTriangleStarPatt(int n)
    {
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void leftTriangleNumRow(int n)
    {
        int i=1;

        while(i<=n)
        {
           int j=1;
           while(j<=i)
           {
            System.out.print(i+" ");
            j=j+1;
           } 
           System.out.println();
           i=i+1;
        }
    }
    public static void leftTriangleNumPatt(int n)
    {
        int ch=1;
        int i=1;

        while(i<=n)
        {
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
    public static void leftTriangleNumPatt2(int n)
    {
        int i=1;
        while(i<=n)
        {
            int j=1;
            int ch=i;
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
    public static void leftTriangleNumPatt3(int n)
    {
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print((i-j+1)+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String[] args) {
        squareBoxStar(5);
        System.out.println("----------------------");
        squareBoxNumRow(5);
        System.out.println("----------------------");
        squareBoxNumCol(5);
        System.out.println("------------------------");
        reverseSquareBoxNumCol(5);
        System.out.println("-------------------------");
        squareBoxNum(5);
        System.out.println("-------------------------");
        leftTriangleStarPatt(5);
        System.out.println("-------------------------");
        leftTriangleNumRow(5);
        System.out.println("-------------------------");
        leftTriangleNumPatt(5);
        System.out.println("-------------------------");
        leftTriangleNumPatt2(5);
        System.out.println("-------------------------");
        leftTriangleNumPatt3(5);
    }
    /*
     OUTPUT:-
     *****
     *****
     *****
     *****
     *****
    
     ----------------------
    1 1 1 1 1 
    2 2 2 2 2 
    3 3 3 3 3 
    4 4 4 4 4 
    5 5 5 5 5 

    ----------------------
    1 2 3 4 5 
    1 2 3 4 5 
    1 2 3 4 5 
    1 2 3 4 5 
    1 2 3 4 5 
    
    ------------------------
    5 4 3 2 1 
    5 4 3 2 1 
    5 4 3 2 1 
    5 4 3 2 1 
    5 4 3 2 1
    
    -------------------------
    1 2 3 4 5 
    6 7 8 9 10 
   11 12 13 14 15 
   16 17 18 19 20 
   21 22 23 24 25 
   
   -------------------------
   *
   **
   ***
   ****
   *****
    
   -------------------------
   1 
   2 2 
   3 3 3 
   4 4 4 4 
   5 5 5 5 5 
   
   -------------------------
   1 
   2 3 
   4 5 6 
   7 8 9 10 
   11 12 13 14 15 
     
   -------------------------
   1 
   2 3 
   3 4 5 
   4 5 6 7 
   5 6 7 8 9 
   -------------------------
   1
   2 1
   3 2 1
   4 3 2 1
   5 4 3 2 1

     */
}
