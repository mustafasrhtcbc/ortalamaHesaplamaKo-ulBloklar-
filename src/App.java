import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int mat,turkce,kimya,fizik,muzik,derssayi=5;
        double ortalama;
        Scanner scan=new Scanner(System.in);

        System.out.print("Matematik notunuzu girin:");
        mat=scan.nextInt();
        if(mat>100||mat<0){mat=0;derssayi=derssayi-1;}
        System.out.print("Türkçe notunuzu girin:");
        turkce=scan.nextInt();
        if(turkce>100||turkce<0){turkce=0;derssayi=derssayi-1;}
        System.out.print("Kimya notunuzu girin:");
        kimya=scan.nextInt();
        if(kimya>100||kimya<0){kimya=0;derssayi=derssayi-1;}
        System.out.print("Fizik notunuzu girin:");
        fizik=scan.nextInt();
        if(fizik>100||fizik<0){fizik=0;derssayi=derssayi-1;}
        System.out.print("Müzik notunuzu girin:");
        muzik=scan.nextInt();
        if(muzik>100||muzik<0){muzik=0;derssayi=derssayi-1;}

        ortalama=(mat+turkce+kimya+fizik+muzik)/derssayi;

        if(ortalama<=55){
            System.out.println("Dersten Kaldınız. Üzgünüm :(");
        }
        else{
            System.out.println("Derleri Geçtiniz. Tebrikler (:");
        }

        System.out.println("Ortalamaya etki eden ders sayısı:"+derssayi);

        System.out.println("Ortalamanız:"+ortalama);
        scan.close();

        

        


    }
}
