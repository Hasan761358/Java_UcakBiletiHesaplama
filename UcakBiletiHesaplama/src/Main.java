import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double ucret=0.10;
        int tip,toplam,gdtoplam,mesafe,yas;

        System.out.print("Mesafe bilgisini giriniz : ");
        mesafe=scan.nextInt();
        System.out.print("Yaş : ");
        yas=scan.nextInt();
        System.out.print("Yolculuk Tipi Gidiş Dönüş (1) Tek Yön (2) : ");
        tip= scan.nextInt();
        toplam= (int) (mesafe*ucret);
        if(yas>0&&mesafe>0&&tip==1||tip==2){
            if(tip==1){
                gdtoplam= (int) (toplam-toplam*0.2);
                if(yas<12){
                    int cocuk=(gdtoplam-gdtoplam/2);
                    System.out.println("Toplam Tutar : "+cocuk);
                } else if (yas>=12&&yas<=24) {
                    int genc= (int) (gdtoplam-gdtoplam*0.1);
                    System.out.println("Toplam Tutar : "+genc);
                } else if (yas >=65) {
                    double yaslı=gdtoplam-gdtoplam*0.3;
                    System.out.println("Toplam Tutar : "+yaslı);
                }else{
                    System.out.println("Toplam Tutar : "+gdtoplam);
                }

            }else {
                if(yas<12){
                    System.out.println("Toplam Tutar : "+ toplam*0.5);
                } else if (yas>=12&&yas<=24) {
                    System.out.println("Toplam Tutar : "+toplam*0.1);
                } else if (yas >=65) {
                    System.out.println("Toplam Tutar : "+toplam*0.3);
                }else{
                    System.out.println("Toplam Tutar : "+toplam);
                }
            }

        }else{
            System.out.println("Hatalı giriş yaptınız!!!");
        }

    }
}