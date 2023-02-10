class Result {
public static void plusMinus(List<Integer> arr) {
    float c1=0,c2=0,c3=0;
    float a,b,c;
    float n = arr.size();
    for(int i=0;i<n;i++){
      if(arr.get(i)==0){
          c1++;
      } 
      else if(arr.get(i)>0){
          c2++;
      }
      else{
          c3++;
      } }
      a = c2/n;
       b = c3/n;
       c = c1/n;
       DecimalFormat df = new DecimalFormat("#.######");
         System.out.println(df.format(a));
         System.out.println(df.format(b));
         System.out.print(df.format(c));
    }

}
