package pkginterface;

/**
 *
 * @author DDR
 */
public class Interface implements I1,D1 {
    public Interface(double bil){
        double hasil=bil%1;
        if(hasil>0||hasil<0){
            D1();
        }
        else {
            I1();
        }
    }
    @Override
    public void I1() {
        System.out.println("Angkamu adalah Integer");
    }

    @Override
    public void D1() {
        System.out.println("Angkamu adalah double");
    }  
}
