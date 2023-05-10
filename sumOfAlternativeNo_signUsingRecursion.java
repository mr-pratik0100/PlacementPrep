

public class SumOfNautralNoAlternateSign {
    // ex : 1,-2,3,-4,5;
        // 1,-2,3,-4,5,-6
    public static int sumOfAlternate(int n){
        if(n==0)return 0;
        if(n%2==0) return sumOfAlternate(n-1)-n;
        else return sumOfAlternate(n-1)+n;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        System.out.println(sumOfAlternate(num));
    }

}
