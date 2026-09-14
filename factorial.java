import java.util.*;
class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter factorial");
        int f=sc.nextInt();
        int r=1;
        for(int i=1; i<=f; i++){
        r=r*i;
        }
        System.out.println("factorial: " +r);
   
}
}