import java.util.*;
public class Registrasi {
    public static String User;
    public static void Regis(){
        ArrayList<String>Akun = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan ID: ");
        String input = scan.nextLine();
        Akun.add(input);
        User = input;
    }
}
