public class Main {
    public static void main(String[] args) {
        Author aI = new Author("Alexandr", "Ivanov");
        Book theWorld = new Book("The World", aI, 1989);
        Author fG = new Author("Fedor", "Grigoryevich");
        Book redSky = new Book("Red Sky", fG, 1999);
        redSky.setYear(2004);
        //toSring
        System.out.println(aI);
        //equals
        boolean authorsBool = aI.equals(fG);
        if (authorsBool) {
            System.out.println("Это один и тот же автор");
        } else {
            System.out.println("Авторы разные");
        }
        boolean booksBool = redSky.equals(theWorld);
        if (booksBool) {
            System.out.println("Это одна и та же книга");
        } else {
            System.out.println("Это разные книги");
        }
        //hashCode
        System.out.println(aI.hashCode());
    }
}