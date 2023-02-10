class Result {
public static void miniMaxSum(List<Integer> arr) {
       long sum1=0,sum2=0;
    Collections.sort(arr);
for(int i=0;i<arr.size()-1;i++){
    sum1=sum1+arr.get(i);
}
for(int i=1;i<arr.size();i++){
    sum2=sum2+arr.get(i);
}
System.out.print(sum1+" "+sum2);
}
}
