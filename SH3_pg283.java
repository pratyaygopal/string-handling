//no of palindrome words in a string
import java.util.*;
class SH3_pg283
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("input a string");
        String s = sc.nextLine();

        s = s.toUpperCase();
        StringTokenizer st = new StringTokenizer(s);
        
        int count = 0;

        while(st.hasMoreTokens())
        {
            String w = st.nextToken();
            String rev = "";
            for(int i = w.length()-1;i>=0;i--)
            {
                rev += w.charAt(i);
            }
            if (w.equals(rev))
            count++;
        }
        System.out.println(count);
    }
}
