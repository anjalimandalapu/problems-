class Result {
    public static int maxMin(int k, List<Integer> arr) {
        Collections.sort(arr);
        int r=arr.get(arr.size()-1);
           for(int i=0;i<arr.size()-k+1;i++){
         int  res= arr.get(i+k-1)-arr.get(i);
           r = Math.min(r,res);
           }
        return r;
  }
}
