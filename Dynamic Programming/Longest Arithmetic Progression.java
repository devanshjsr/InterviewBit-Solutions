public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<Integer> A) {
        
        int n=A.size();int max=1;
        if(n>1){
            max=2;
        }
       ArrayList<HashMap<Integer,Integer>> dp=new ArrayList<HashMap<Integer,Integer>>();
       for(int i=0;i<n;i++){
           dp.add(new HashMap<Integer,Integer>());
       }
        for(int i=1;i<A.size();i++){
                    HashMap<Integer,Integer> hmi=dp.get(i);
            for(int j=0;j<i;j++){
                    HashMap<Integer,Integer> hmj=dp.get(j);
                    if(hmj.containsKey(A.get(i)-A.get(j))){
                    
                        hmi.put(A.get(i)-A.get(j),hmj.get(A.get(i)-A.get(j))+1);
                        max=Math.max(hmi.get(A.get(i)-A.get(j)),max);
                    }else{
                            //System.out.println("*");
                        hmi.put(A.get(i)-A.get(j),2);
                    }
            }
        }
        
        for(int i=0;i<A.size();i++)
        {
            HashMap<Integer,Integer> hmi=dp.get(i);
            
            System.out.println(hmi);
        }
        return max;
    }
}
