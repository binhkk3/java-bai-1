import java.util.Scanner;

public class pt_bac1 {
    public static void main(String[] args) {
        float a ;
        float b;
        float kq = 0;
        Scanner nhan = new Scanner(System.in);
        a = nhan.nextFloat();
        b = nhan.nextFloat();
        if(a==0&&b==0){
            System.out.println("pt vô số nghiệm");
        }
        if(a==0&&b!=0){
            System.out.println("pt vô nghiệm");
        }
        if(a!=0&& b!=0){
         kq = -b/a;
            System.out.println(kq);
        }
    }
}
