//no of palindrome words in a string
import java.util.*;
class SH8_pg283
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
            char ch = w.charAt(0);
            char ch1 = w.charAt(w.length()-1);
            if(ch>='A'&&ch<='Z'&&ch1>='a'&&ch1<='z')
            s1+=w+" ";
        }
        System.out.println(s1);
    }
}
