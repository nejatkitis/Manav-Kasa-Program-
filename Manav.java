import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut =2.14;
        double elma =3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5;
        double a,e,d,m,p;
        Scanner k = new Scanner(System.in);
        System.out.println("Armut kaç kilo ?");
        a =k.nextDouble();
        System.out.println("Elma kaç kilo ?");
        e =k.nextDouble();
        System.out.println("Domates kaç kilo ?");
        d =k.nextDouble();
        System.out.println("Muz kaç kilo ?");
        m =k.nextDouble();
        System.out.println("Patlıcan kaç kilo ?");
        p =k.nextDouble();
        double toplam = (armut*a)+(elma*e)+(domates*d)+(muz*m)+(patlican*p);
        System.out.println("Toplam tutar : " +toplam+ "TL");

    }
}
