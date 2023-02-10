class Result {
public static int pageCount(int n, int p) {
        int a=0;
        if(n%2==0){
        a = ((n-p+1)/2);
        }
        else{
          a = (n-p)/2;
        }
        int b = p/2;
        if(a<b){
            return a;
        }
        else{
            return b;
        }
    }

}
