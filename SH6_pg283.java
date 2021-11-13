//no of palindrome words in a string
import java.util.*;
class SH6_pg283
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("input a string");
        String s = sc.nextLine();
        s = s.toUpperCase();
        
        StringTokenizer st = new StringTokenizer(s);
        String s1 = "";

        while(st.hasMoreTokens())
        {
            String w = st.nextToken();
            char ch = w.charAt(0);
            if(ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U')
            s1+="AN "+w+" ";
            else
            s1+=w+" ";
        }
        System.out.println(s1);
    }
}
