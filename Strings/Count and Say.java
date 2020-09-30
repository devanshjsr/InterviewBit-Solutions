public class Solution {
    public String countAndSay(int A) 
    {
        String s="1";
        
        
        for(int i=2;i<=A;i++)
        {
            //System.out.println(s);
            StringBuffer s1=new StringBuffer();
            int c=0;
            
            char tmp=s.charAt(0);
            
            // if(i==2)
            // {
            //     tmp='1';
            // }
            // else
            // {
            // //tmp=s.charAt(1);
            // //System.out.println(tmp);
            
            // }
           //System.out.println(tmp);
            
            for(int j=0;j<s.length();j++)
            {
                if(tmp==s.charAt(j))
                {
                    c++;
                }
                else
                {
                    s1.append(String.valueOf(c));
                   // System.out.println(s1);
                    s1.append(String.valueOf(tmp));
                    
                    c=1;
                    tmp=s.charAt(j);
                }
            }
            
            
                    s1.append(String.valueOf(c));
                   // System.out.println(s1);
                    s1.append(String.valueOf(tmp));
            
             s=s1.toString();
            
           // s=s1;
           
          // System.out.println(s);
            
            
        }
        
        return s;
    }
}
