//no of palindrome words in a string
import java.util.*;
class SH11_pg284
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("input a string");
        String s = sc.nextLine();

        s=s.toUpperCase();
        StringTokenizer st = new StringTokenizer(s);
        String s1 = "";
        
        

        while(st.hasMoreTokens())
        {
            String w = st.nextToken();
            s1+=w.charAt(0);
        }
        System.out.println(s1);
    }
}
