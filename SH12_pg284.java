//no of palindrome words in a string
import java.util.*;
class SH12_pg284
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
            String w1 = "";
            for(int i = 0;i<w.length();i++)
            {
            if(w.charAt(i)=='a'||w.charAt(i)=='e'||w.charAt(i)=='i'||w.charAt(i)=='o'||w.charAt(i)=='u'||w.charAt(i)=='A'||w.charAt(i)=='E'||w.charAt(i)=='I'||w.charAt(i)=='O'||w.charAt(i)=='U')
                w+='*';
            else
                w+=w.charAt(i);
            }
            s1+=w1+" ";
        }
        System.out.println(s1);
    }
}
