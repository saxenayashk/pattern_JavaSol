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
    public static void main(String[] args) {
       alphabetSquareRow(5); 
       System.out.println("----------------"); 
       alphabetSquarePatt(5);     
       System.out.println("-------------------"); 
       alphabetSquarePatt2(5);
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
     */
}
