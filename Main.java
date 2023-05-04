import java.util.Scanner;

/** 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sicaklik degerini girin");

            int sicaklik=scanner.nextInt();

            if (sicaklik<=5) {
                System.out.println("Kayak yapa bilirsiniz");
            }else if (sicaklik<15) {
                System.out.println("Sinemaya gide bilisiniz");
            }else if (sicaklik<=25 ) {
                    System.out.println("Piknik yapmaya gide bilirsiniz");

                }else {
                    System.out.println("Yuzmeye gide bilirsiniz");
                }
                }
                }



