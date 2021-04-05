import java.util.Scanner;

public class nhap {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Kiểm tra số nguyên tố");
        System.out.println("2. Kiểm tra số chẵn ");
        System.out.println("3. Kiểm tra số chính phương");
        System.out.println("0.Thoát chương trình ");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                int N;
                String count = "";
                Scanner prime = new Scanner(System.in);
                System.out.println("Nhap so ");
                int number;
                number = prime.nextInt();
                boolean ck = true;
                for (N = 2; N < number; N++) {
                    if (number % N == 0) {
                        System.out.println(number + " is not a prime");
                        ck = false;
                        break;
                    }
                }
                if (ck) {
                    System.out.println(number + " is a  prime");
                }
            case 2:
                Scanner chan = new Scanner(System.in);
                System.out.println("Nhap so");
                int so;
                so = chan.nextInt();
                if (so % 2 == 0) {
                    System.out.println(so + "la so chan");
                } else {
                    System.out.println(" la so le");
                }
            case 3:
                Scanner chinh_huong = new Scanner(System.in);
                System.out.println("nhap so");
                int num;
                num = chinh_huong.nextInt();
                int i;
                boolean check = true;
                for (i = 0; i < num; i++) {
                    if (Math.sqrt(num) == i) {
                        System.out.println(num+"la so chinh phuong");
                        check = true;
                        break;
                    }
                }if(check =false){
                    System.out.println(num+"ko la so chinh phuong");
            }
        }
    }
}
