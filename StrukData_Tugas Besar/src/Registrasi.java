import java.util.*;
public class Registrasi {
    public static String User;
    public static void Regis(){
        TreeSet<String> Akun = new TreeSet<String>();
	Scanner scan = new Scanner(System.in);
	System.out.print("Masukkan ID: ");
	String input = scan.nextLine();
	Akun.add(input);
	System.out.println("Selamat Datang "+Akun+"!");
        User = input;
    }
}
