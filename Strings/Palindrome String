public class Solution {
    public int isPalindrome(String A) 
    {
        int i=0,j=A.length()-1;
        
        
        while(i<A.length() && j>=0)
        {
            int v1=A.charAt(i);
            while(((v1>=48 && v1<=57) ||(v1>=65 && v1<=90) || (v1>=97 && v1<=122))==false)
            {
                i++;
                
                if(i==A.length())
                {
                    break;
                }
                
                v1=A.charAt(i);
            }
            
            int v2=A.charAt(j);
            while(((v2>=48 && v2<=57) || (v2>=65 && v2<=90) || (v2>=97 && v2<=122))==false)
            {
                j--;
                
                if(j<0)
                {
                    break;
                }
                v2=A.charAt(j);
            }
            
            if(((v2>=48 && v2<=57) || (v2>=65 && v2<=90) || (v2>=97 && v2<=122))==false && ((v1>=48 && v1<=57) ||(v1>=65 && v1<=90) || (v1>=97 && v1<=122))==false)
            {
                System.out.println(v1+" "+v2);
            if(v1!=v2 && (v1+32)!=v2 && (v1-32)!=v2)
            {
                return 0;
            }
            }
            
            i++;
            j--;
        }
        
        return 1;
        
    }
}
