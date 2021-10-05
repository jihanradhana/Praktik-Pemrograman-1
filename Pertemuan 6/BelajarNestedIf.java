import java.util.Scanner; 
public class BelajarNestedIf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan umur Anda : ");
        int umur = s.nextInt();
        if(umur <= 5 && umur>= 0) {
            System.out.println("Anda masih balita");
            System.out.print("Masukkan umur orang tua Anda : ");
            int umurOrangTua = s.nextInt();
            if(umurOrangTua < 15);{
                System.out.println("Sebaiknya anda meminta bantuan pengasuh anak.");
            } 
         } else if (umur > 5 && umur <= 19){
            System.out.println("Anda sudah remaja");
         } else if (umur > 19) {
            System.out.println("Anda sudah dewasa");
         } else {
            System.out.println("Umur anda tidak valid");
         }
    }
}
