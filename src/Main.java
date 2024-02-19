import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler
        int mat, fizik, kimya, turkce, muzik;
        //Scanner sınıfı
        Scanner inp = new Scanner(System.in);
        //Kullanıcı Değerleri
        System.out.print("Matematik Ders Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Ders Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Ders Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Ders Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Müzik Ders Notunuz : ");
        muzik = inp.nextInt();
        //Ortalama Bulma
        int toplam = (mat + fizik + kimya + turkce + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız: " + sonuc);

        //Geçti-Kaldı Değerlendirmesi
        double a=sonuc, b=60;
        Boolean x = a>=b;
        Boolean y = a<b;
        Boolean kaldi = !x;
        Boolean geçti = x;
        String ortalamasonucu = kaldi? "Sınıfta Kaldı" : "Sınıfı Geçti";
        System.out.println(ortalamasonucu);


    }
}