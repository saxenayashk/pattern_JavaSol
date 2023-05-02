public class LoopCase
{
    public static String isLowerUpperNum(char ch)
    {
        if(ch>='a' && ch<='z')
        {
            return "LOWERCASE";
        }
        else if(ch>='A' && ch<='Z')
        {
            return "UPPERCASE";
        }
        else if(ch>='0' && ch<='9')
        {
            return "NUMBER";
        }

        return "-1";
    }

    public static boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;
        }

        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isLowerUpperNum('A'));
        System.out.println(isLowerUpperNum('t'));
        System.out.println(isLowerUpperNum('6'));
        System.out.println("------------------");
        int num=7;
        System.out.println("Is "+num+" a prime number: "+isPrime(num));
    }
    /*
    Output:-
    UPPERCASE
    LOWERCASE
    NUMBER
    ------------------
Is 7 a prime number: true
    */ 
}