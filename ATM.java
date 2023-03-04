import java.util.Scanner;
public class ATM {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Scanner giris=new Scanner(System.in);

        System.out.println("    ***|=  FIRAT BANKASI  =|***    \n"+"  \nHOŞGELDİNİZ! "+"\n+ Hesabınızı görüntülemek için lütfen bilgilerinizi giriniz.\n");

        int right=3;
        int balance=1250;
        String cardNo, password;
        int select;

        while(right>0) {
            System.out.print("Kart numaranız:");
            cardNo = input.next();
            System.out.print("Şifreniz:");
            password = giris.next();
            if(cardNo.equals("545656121898232") && password.equals("tarihte1110.")){
                System.out.print("* Sisteme giriş yapıldı. *");
                System.out.println("\nMerhaba YUSUF UYGUR ");
                do{
                    System.out.println("\nLütfen gerçekleştirmek istediğiniz işlemi seçiniz:");
                    System.out.println("1-Para Yatırma\n"+
                            "2-Para Çekme\n"+
                            "3-Bakiye Sorgulama\n"+
                            "4-Çıkış");
                    select= input.nextInt();

                    if(select>=5){
                        System.out.println("Hatalı giriş yaptınız!");
                    }

                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı giriniz:");
                            int price= input.nextInt();
                            balance+=price;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı giriniz:");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.print("Bakiyeniz:"+balance);
                            break;
                    }
                }
                while(select !=4);
                break;
            }
            else{
                right--;
                System.out.print("Kart numarası ya da şifre hatalı!");
                if(right==0){
                    System.out.print("\nHesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                    break;
                }
                else{System.out.println("\nKalan hakkınız: "+right);
                }
            }
        }
        if(right!=0){
            System.out.println("\n* Hesaptan başarıyla çıkış yapıldı. *");
        }
    }
}
