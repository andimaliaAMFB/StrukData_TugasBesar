import java.util.*;
import java.lang.String;
public class Bioskop {
    static Scanner input = new Scanner(System.in);
    static Scanner inputC = new Scanner(System.in);
    static Scanner inputS = new Scanner(System.in);
    public static void main(String args[]){
        Scanner inputC = new Scanner(System.in);
        title();
        char ulg;
        do{
            menu();
            System.out.print("Ulang Program? [Y/N]: ");
            ulg = inputC.next().charAt(0);
        }while (ulg == 'y'|ulg =='Y');
        staff();
    }
    static void title(){
        System.out.println("=====================================================");
        System.out.println("             Bioskop UIN SGD Informatika");
        System.out.println("=====================================================");
    }
    static void menu(){
        int plh = -1;
        do
        {
            System.out.print("Akun        : ");
            System.out.println();
            System.out.print("Jumlah Tiket: ");
            System.out.println();
            System.out.println("_____________________________________________________");
            System.out.print("1. Registrasi\n2. Beli Tiket\n3. Gunakan Tiket"
                    + "\n4. Lihat Film\n5. Caru Film\n0. EXIT\n  : ");
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
                    EXIT();
                    break;
                default:
                    System.out.println("Wrong Entry\n");
                    break;
            }
            System.out.println("_____________________________________________________");
        }while(plh!=0);
    }
    static void Reg(){
        
    }
    static void Buy(){
        
    }
    static void Use(){
        
    }
    static void View(){
        
    }
    static void Search(){
        
    }
    static void EXIT(){
        System.out.println("            >-Keluar Dari Menu Utama-<");
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