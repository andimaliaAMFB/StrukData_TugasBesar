import java.awt.event.KeyEvent;
import java.util.*;
import java.lang.String;
public class Bioskop {
    static Scanner input = new Scanner(System.in);
    static Scanner inputC = new Scanner(System.in);
    static Scanner inputS = new Scanner(System.in);
    static Registrasi reg = new Registrasi();
    static BeliTiket buy = new BeliTiket();
    static LihatFilm view = new LihatFilm();
    public static void main(String args[]){
        Scanner inputC = new Scanner(System.in);
        char ulg;
        do{
            menu();
            System.out.print("Ulang Program? [Y/N]: ");
            ulg = inputC.next().charAt(0);
        }while (ulg == 'y'|ulg =='Y');
        staff();
    }
    
    // variabel called by another program
    public static String Akun;
    public static int JumTiket;
    
    static void title(){
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        System.out.println("=====================================================");
        System.out.println("             Bioskop UIN SGD Informatika");
        System.out.println("=====================================================");
    }
    static void menu(){
        int plh = -1;
        do
        {
            title();
            System.out.print("Akun        : ");
            System.out.println(Akun);
            System.out.print("Jumlah Tiket: ");
            System.out.println(JumTiket);
            System.out.println("_____________________________________________________");
            System.out.print("1. Registrasi\n2. Beli Tiket\n3. Gunakan Tiket"
                    + "\n4. Lihat Film\n5. Cari Film\n0. Sign Out\n  : ");
            plh = input.nextInt();
            System.out.println("_____________________________________________________");
            switch(plh)
            {
                case 1:
                    Reg();
                    break;
                case 2:
                    Buy();
                    break;
                case 3:
                    Use();
                    break;
                case 4:
                    View();
                    break;
                case 5:
                    Search();
                    break;
                case 0:
                    UserOff();
                    break;
                default:
                    System.out.println("Wrong Entry\n");
                    break;
            }
            System.out.println("_____________________________________________________");
        }while(plh!=0);
    }
    static void Reg(){
        reg.Regis();
        Akun = reg.User;
    }
    static void Buy(){
        buy.Buy();
        JumTiket = buy.jumlahPembelian;
    }
    static void Use(){
        
    }
    static void View(){
        view.FilmSorted();
    }
    static void Search(){
        
    }
    static void UserOff(){
        System.out.println("                     >-Sign Out-<");
        Akun = null;
        JumTiket = 0;
    }
    static void staff(){
        System.out.println("____________________________________________________");
        System.out.println("                     Program by");
        System.out.println("                Kelompok 2 | Teori B");
        System.out.println("               Herdiansyah | 1187050043");
        System.out.println("            Andi Malia F B | 1197050014");
        System.out.println("              Dio Rakasiwi | 1197050032");
        System.out.println("           Haruna Elfathin | 1197050048");
        System.out.println("            Rizal Setiawan | 1197050121");
        System.out.println("====================================================");
    }
}