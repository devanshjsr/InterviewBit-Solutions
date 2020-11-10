public class Solution {
    public boolean isPower(int a) 
    {
        if(a==1) return true;
        
    for (int i = 2; i*i <= a; i++) 
    {
      int p = a;
      System.out.println(i+" "+p);
      while(p%i == 0)
      {
        p/=i;
      }
      
      System.out.println(i+" "+p);
      
      if(p == 1) return true;
    }
    
    return false;
        
    }
}
