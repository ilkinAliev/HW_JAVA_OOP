package HW_SEMINAR_01;

public class Program {
    public static void main(String[] args) {
        Bread bread = new Bread("Hleb", 50, 2, "shtuk", 
                                "15.08.2022", "ржаная");
        System.out.println(bread.toString());

        Diapers diapers = new Diapers("pampers", 500, 1, "shtuk", 0,
                                     "no", '1', 2, 3, "type");
        System.out.println(diapers.toString());

        Eggs eggs = new Eggs("Devyatkino", 105, 20, "package", "30.08.2022",
                             10);
        System.out.println(eggs.toString());

        Lemonade ld = new Lemonade("fanta", 100, 1, "bottle", 0.5);
        System.out.println(ld.toString());

        Milk milk = new Milk("Korovushka", 80, 1, "package", 0.8, "23.08.2022", 3);
        System.out.println(milk.toString());

        Toilet_paper tp = new Toilet_paper("33 metra", 20, 2, "rulon", 8, 3);
        System.out.println(tp.toString());
    }
}
