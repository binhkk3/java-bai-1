import java.util.Scanner;

public class doi_so_thanh_chu {
    public static void main(String[] args) {
        System.out.println("nhập số bạn muốn đổi : ");
        Scanner scanner = new Scanner(System.in);
        int so = scanner.nextInt();
        if (so>=0 && so <= 10){
            switch (so){
                case 0:
                    System.out.println("so không");
                    break;
                case 1:
                    System.out.println("số môt");
                    break;
                case 2:
                    System.out.println("số hai");
                    break;
                case 3:
                    System.out.println("số ba");
                    break;
                case 4:
                    System.out.println("số bốn");
                    break;
                case 5:
                    System.out.println("số năm");
                    break;
                case 6:
                    System.out.println("số sáu");
                    break;
                case 7:
                    System.out.println("số bảy");
                    break;
                case 8:
                    System.out.println("số tám");
                    break;
                case 9:
                    System.out.println("số chín");
                    break;
                case 10:
                    System.out.println("số mười");
                    break;

            }
        }
        if(so>10 && so<100){
            int chuc = so%10;
            int du = so%10;
            switch (du){
                case 0:
                    System.out.println(chuc + );
                    break;
                case 1:
                    System.out.println("số mười môt");
                    break;
                case 2:
                    System.out.println("số hai");
                    break;
                case 3:
                    System.out.println("số mười ba");
                    break;
                case 4:
                    System.out.println("số mười bốn");
                    break;
                case 5:
                    System.out.println("số mười năm");
                    break;
                case 6:
                    System.out.println("số mười sáu");
                    break;
                case 7:
                    System.out.println("số mười bảy");
                    break;
                case 8:
                    System.out.println("số mười tám");
                    break;
                case 9:
                    System.out.println("số chín");
                    break;
                case 10:
                    System.out.println("số mười");
                    break;

            }
        }
    }
}
