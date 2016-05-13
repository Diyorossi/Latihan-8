package pkginterface;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner ddr=new Scanner(System.in);
        System.out.print("Masukkan Angkamu : ");
        double bil=ddr.nextDouble();
        Interface I1= new Interface(bil);
    }
}
