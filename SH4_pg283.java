//no of palindrome words in a string
import java.util.*;
class SH4_pg283
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("input a string");
        String s = sc.nextLine();

        s = s.toUpperCase();
        StringTokenizer st = new StringTokenizer(s);
        String s1 = "";
        int count = 0;

        while(st.hasMoreTokens())
        {
            count++;
            if (count<3)
            s1+=st.nextToken().charAt(0)+".";
            else
            s1+=st.nextToken();
        }
        System.out.println(s1);
    }
}
