class Result {
    public static int sockMerchant(int n, List<Integer> ar) {
        int sum=0;
        HashSet<Integer> h = new HashSet<>(ar);
        System.out.print(h);
        List<Integer> l = new ArrayList<>(h);
        for(int i=0;i<h.size();i++){
            int a=0;
            for(int j=0;j<n;j++){
                if(l.get(i)==ar.get(j)){
                    a++;
                } 
            }
            sum = sum+a/2;
        }
        return sum; 
    }
}
