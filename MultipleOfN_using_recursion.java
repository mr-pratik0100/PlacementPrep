

public class MultipleOfN_recursion {
    public static void multipleOfN(int n, int k){
        if(k==1){
            System.out.println(n);
            return;
        }
        multipleOfN(n,k-1);
        System.out.println(n*k);
    }


    public static void main(String[] args) {
        multipleOfN(3,4);
    }
}
