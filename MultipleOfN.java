

 public static int pow(int n, int m){
//        if(m==0)return 1;
//        return pow(n,m-1)* n;

        //optimal approach

        if(m==0) return 1;
      int smaller=  pow(n,m/2);
        if(m%2==0)return smaller*smaller;
        return smaller*smaller*n;

    }
    public static void main(String[] args) {
        System.out.println(pow(2,7));
