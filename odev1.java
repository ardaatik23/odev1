 // Okul puanlarının harf karşılığını yazan program.
import java.util.Scanner; 
public class Main
{
	public static void main(String[] args){ 
         Scanner scan= new Scanner(System.in); 
          System.out.println("Sınav notunuzu giriniz(0-100 arasında): ");
   int not= scan.nextInt();
      if(not>=70 && not<=100) {

             System.out.println("Tebrikler, AA ile gectiniz.");

           }
         else if(not>=50 && not<70){

             System.out.println("Tebrikler, BB ile gectiniz.");

           }
         else if(not>=35 && not<50){

             System.out.println("Tebrikler, DC ile gectiniz.");

          
           }
           else if(not>=0 && not<35){

             System.out.println("Tebrikler, FF ile KALDINIZ.");

           }
     }
}

//3 ile 100 arasında asal sayıların toplamını bulan program.
   public class Main {
        public static void main(String[] args) {
            int sayi;
            for(int i=3; i<=100; i++){
                sayi=0;
                for(int j=2; j<=i/2; j++){
                    if(i%j==0) sayi++;
                }
                if(sayi==0) System.out.println(+i);
               
            }
        }
    }
