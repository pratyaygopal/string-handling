//piglatin words
import java.util.*;
class SH13_pg284
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
        
        while(st.hasMoreTokens())
        {
            String w = st.nextToken();
            for(int i =0;i<=w.length()-1;i++)
            {
                char ch = w.charAt(i);
                if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    s1 = w.substring(i);
                    s2 = w.substring(0,i);
                    break;
                }
            }
            System.out.print(s1+s2+"AY ");
        }
    }
}
