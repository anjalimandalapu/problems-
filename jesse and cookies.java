class Result {

    public static int cookies(int k, List<Integer> A) {
    PriorityQueue<Integer> q=new PriorityQueue<Integer>(A);
        int a=q.peek();
        int count=0;
        while(q.size()>1&& a<k){
            int min1=q.remove();
            int min2=q.remove();
            int next=min1+min2*2;
            q.add(next);
            count+=1;
            a=q.peek();
        }
     if(a<k){
         return-1;
     }                        
        else {
            return count;
        }                                     
                                    

    }

}
