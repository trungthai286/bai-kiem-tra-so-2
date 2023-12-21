import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<NguoiDung> arrnguoiDung = new ArrayList<>();
        NguoiDung nguoiDung1 = new NguoiDung("trungthai", "trungthai@gmail.com", "123456789");
        NguoiDung nguoiDung2 = new NguoiDung("ngocquynh", "ngocquynh@gmail.com", "987654321");
        NguoiDung nguoiDung3 = new NguoiDung("thaonguyen", "thaonguyen@gmail.com", "trungthai123");
        arrnguoiDung.add(nguoiDung1);
        arrnguoiDung.add(nguoiDung2);
        arrnguoiDung.add(nguoiDung3);

        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        int luaChon2 = 0;
        do {
            System.out.println("MENU ---------- ");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                    "1.	Đăng nhập.\n"
                            + "2.	Đăng ký.\n"
                            + "3.	Quên mật khẩu.\n");
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon == 1) {
                Scanner scn = new Scanner(System.in);
                System.out.println("\nNhap email:");
                String nhapEmail = scn.nextLine();
                System.out.println("\nNhap password:");
                String nhapPass = scn.nextLine();
                for (int i = 0; i < arrnguoiDung.size(); i++) {
                    if (arrnguoiDung.get(i).getEmail().equalsIgnoreCase(nhapEmail) && arrnguoiDung.get(i).getPassword().equalsIgnoreCase(nhapPass)) {
                        System.out.println("Chào mừng " + arrnguoiDung.get(i).getUsername() + " bạn có thể thực hiện các công việc sau:\n" +
                                "1.Thay đổi username\n" +
                                "2.Thay đổi email (Không được trùng với email của user khác trong List)\n" +
                                "3.Thay đổi mật khẩu\n" +
                                "4.Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)\n" +
                                "5.Thoát chương trình");
                    }
                    System.out.println("Nhap cong viec ban muon thuc hien");
                    Scanner sc1 = new Scanner(System.in);
                    luaChon2 = sc1.nextInt();
                    if (luaChon2 == 1) {
                        //1. Thay doi username
                        Scanner sc2 = new Scanner(System.in);
                        System.out.println("Nhap username thay doi");
                        String newuser = sc2.nextLine();
                        arrnguoiDung.get(i).getUsername().replaceAll(arrnguoiDung.get(i).getUsername(), newuser);
                        break;

                    }
                    if (luaChon2 == 2) {
                        //2.Thay đổi email
                        System.out.println("Nhap email thay doi");
                        String newemail = new Scanner(System.in).nextLine();
                        arrnguoiDung.get(i).getEmail().replaceAll(arrnguoiDung.get(i).getEmail(), newemail);
                        break;

                    }
                    if (luaChon2 == 3) {
                        //3.Thay đổi pass
                        System.out.println("Nhap email thay doi");
                        String newpass = new Scanner(System.in).nextLine();
                        arrnguoiDung.get(i).getPassword().replaceAll(arrnguoiDung.get(i).getPassword(), newpass);
                        break;
                    }
                    break;
                }
                break;
            }
            if (luaChon == 2) {
                System.out.println("Nhập username: ");
                String username = sc.nextLine();
                System.out.println("Nhập Email: ");
                String email = sc.nextLine();
                System.out.println("Nhập password: ");
                String password = sc.nextLine();
                NguoiDung nguoidungmoi = new NguoiDung(username, email, password);
                arrnguoiDung.add(nguoidungmoi);

            }

            if (luaChon == 3) {
                System.out.println("Nhập Email: ");
                String email1 = sc.nextLine();
                for (int i = 0; i < arrnguoiDung.size(); i++) {
                    if (arrnguoiDung.get(i).getEmail().equalsIgnoreCase(email1)) ;
                    else {
                        System.out.println("chưa tồn tại tài khoản");
                    }
                    break;
                }
            }
            break;
        }

        while (luaChon != 0);


    }
}