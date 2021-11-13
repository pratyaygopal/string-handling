//no of palindrome words in a string
import java.util.*;
class SH5_pg283
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("input a string");
        String s = sc.nextLine();

        s = s.toUpperCase();
        StringTokenizer st = new StringTokenizer(s);
        String s1 = "";
        String s2 = "";
        int count = 0;

        while(st.hasMoreTokens())
        {
            count++;
            if (count<3)
            s1+=st.nextToken()+" ";
            else
            s2+=st.nextToken();
        }
        System.out.println(s2+", "+s1);
    }
}
