//no of palindrome words in a string
import java.util.*;
class SH10_pg283
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("input a string");
        String s = sc.nextLine();

        
        StringTokenizer st = new StringTokenizer(s);
        String s1 = "";
        
        

        while(st.hasMoreTokens())
        {
            String w = st.nextToken();
            String w1 = (char)(w.charAt(0)-32)+w.substring(1);
            s1+=w1+" ";
        }
        System.out.println(s1);
    }
}
