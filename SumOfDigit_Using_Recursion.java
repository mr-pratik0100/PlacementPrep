

public class SumOfDigit_Recursion {
    static int sumOfDigit(int num){
        if(num>=1 && num<=9){
            return num;
        }
        return sumOfDigit(num/10)+(num%10);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        System.out.println(sumOfDigit(num));
    }
}
