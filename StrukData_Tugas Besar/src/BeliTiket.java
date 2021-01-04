import java.util.Scanner;
import java.util.ArrayList;
public class BeliTiket {
    public static int jumlahPembelian = 0;
    public static Bioskop program = new Bioskop();
    public static BeliTiket buy = new BeliTiket();
    //public static void main(String[] args){
    public static void Buy(){
        Scanner inputc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        char YorN;
        
        //program start
        System.out.print("Apakan Ini Akun Anda? ("+program.Akun+") [Y/N]: ");
        YorN = inputc.next().charAt(0);
        if(YorN == 'Y'|| YorN == 'y')
        {
            if(program.Akun == null)
            {
                System.out.println("Selamat Datang "+program.Akun);
                String genre = null, title = null, jam = null;
                program.View();
                System.out.print("Pilih Film Yang Ingin Ditonton: ");
                int pilihflm = input.nextInt();
                genre = (String) program.No_Film.get(pilihflm);
                title = (String) program.Film_Genre.get(genre);
                System.out.println("1. 13.00 WIB\n2. 15.45 WIB\n3. 18.30 WIB");
                System.out.print("Pilih Jam Tayang Yang Ingin Ditonton: ");
                int pilihjam = input.nextInt();
                System.out.print("Jumlah Tiket: ");
                int jumtiket = input.nextInt();
                switch(pilihjam)
                {
                    case 1:
                        jam = "1300";
                        break;
                    case 2:
                        jam = "1545";
                        break;
                    case 3:
                        jam = "1830";
                        break;
                    default:
                        System.out.println("Wrong Entry\n");
                        break;
                }
                //System.out.println(genre+"|| "+title+"|| "+jam);
                Tiket(genre,title,jam,Integer.toString(jumtiket));
            }
            else
                program.Reg();
        }
        else
            program.Reg();
    }
    public static void Tiket(String Genre, String Title, String Jam, String Jum){
        char var;
        String [] tiketCode = new String [100];
        String tiketcode = null;
        ArrayList<String> tiketFull = new ArrayList<String>();
        tiketFull.add(Genre);
        tiketFull.add(Title);
        tiketFull.add(Jam);
        tiketFull.add(Jum);
        int j=0, k=0;
        for(int i=0;i<9;i++)
        {
            //code of tiket be like: GGTTJJJJ-JmJm
            //G = Genre     T = Title
            //J = Jam       Jm = Jum
            var = tiketFull.get(k).charAt(j);
            j++;
            if(j==2&&k!=2)
            {
                j = 0;
                k++;
            }
            if(j==4&&k==2)
            {
                j = 0;
                k++;
            }
            if(i==0)
                tiketcode = String.valueOf(var);
            else
                tiketcode = tiketcode + var;
            if(i==7)
            {
                if(Integer.parseInt(Jum)<10)
                    tiketcode = tiketcode + "-0";
                else
                    tiketcode = tiketcode + "-";
            }
            //output
            //System.out.println(tiketcode+"|| + "+var+"|| "+tiketFull.get(k));
        }
        buy.Add(tiketcode);
        jumlahPembelian++;
    }
    //linkedlist Node
    public class Node{
        String data;
        Node next;
        public Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void Add(String data){
        Node newNode = new Node(data);
        if(head==null)
        {
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void display(){
        Node current=head;
        int no = -1;
        if(head==null)
        {
            kosong();
        }
        while(current!=null)
        {
            no++;
            if(no!=0)
                System.out.println(no+". "+current.data);
            current=current.next;
        }
    }
    void kosong(){
        System.out.println("Data Kosong");
        return;
    }
}
