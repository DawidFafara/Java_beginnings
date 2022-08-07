import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        /*
        zadanie0();
        zadanie1();
        zadanie2();
        zadanie3();
        zadanie4();
        zadanie4a();
        wykonajObliczenia(4,6);
        zadanie5();
        zadanie5a(2);
        zadanie5a(1500);
        zadanie5b();

        System.out.println(isEqual("Haslo"));
        */

        System.out.println(convertCtoF (55));
        System.out.println(convertFtoC (55));
        System.out.println(convertKtoC (55));
        System.out.println(convertKtoF (55));
        System.out.println(convertFtoK (55));
    }

    /*
    Zadanie 0:
    Przenieść wypiasnie "Hello World" w terminalu do osobnej metody
    dodać wywołanie metody z metody main
     */
    public static void zadanie0() {
        System.out.println("Hello World");
    }

    //TYPY DANYCH

    /*
    Zadanie 1:
    Typy zmiennych:
    byte -> b = 68
    short -> s = 10000
    int -> i = 2147483647
    long -> l = 822337203
    float -> f = 234.5f
    double -> d = 123.4
    boolean -> bo = true
    string -> st = "Software Development Academy"
    */

    public static void zadanie1() {
        byte b = 68;
        short s = 10000;
        int i = 2147483647;
        long l = 822337203;
        float f = 234.5f;
        double d = 123.4;
        boolean bo = true;
        String st = "Software Development Academy";

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bo);
        System.out.println(st);
    }

    /*
    Zadanie 2:
    int -> i = 100000000000000000000000
    long -> l = -900000000000000000000000
    double -> d = 100
     */

    public static void zadanie2() {
        //int i = 100000000000000000000000;
        //long l = -900000000000000000000000;
        double d = 100;

    }

    /*
    Zadanie 3:
    Wyświetl prośbę o podanie liczby całkowitej, np. "Podaj liczbę całkowitą "
    Podaj z klawiatury liczbę całkowitą i ją wyświetl, np "Użytkownik podał liczbę x" gdzie x jest wspianą liczbą
     */
    public static void zadanie3() {
        System.out.println("Podaj liczbę całkowitą");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Użytkownik podał liczbę " + a);

    }

    //OPERATORY

    //Zadanie 4:
    //Pobierz 2 liczby całkowite
    //Zapisz wynik operacji do osobnych zmiennych: dodawania, odejmowania, mnożenia, dzielenia, podniesienia pierszego do potęgi drugiej
    public static void zadanie4() {
        System.out.println("Podaj pierwszą liczbę");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();

        double c = a + b;
        double d = a - b;
        double e = a * b;
        double f = a / b;
        double g = Math.pow(a, b);

        System.out.println("Wynik dodawania " + a + " oraz " + b + " daje wynik " + c);
        System.out.println("Wynik odejmowania " + a + " oraz " + b + " daje wynik " + d);
        System.out.println("Wynik mnożenia " + a + " oraz " + b + " daje wynik " + e);
        System.out.println("Wynik dzielenia " + a + " oraz " + b + " daje wynik " + f);
        System.out.println("Wynik podniesienia " + a + " do potęgi " + b + " daje wynik " + g);
    }

    public static void wykonajObliczenia(int liczba1, int liczba2)
    {
        double c = liczba1 + liczba2;
        double d = liczba1 - liczba2;
        double e = liczba1 * liczba2;
        double f = liczba1 / liczba2;
        double g = Math.pow(liczba1, liczba2);

        System.out.println("Wynik dodawania " + liczba1 + " oraz " + liczba2 + " daje wynik " + c);
        System.out.println("Wynik odejmowania " + liczba1 + " oraz " + liczba2 + " daje wynik " + d);
        System.out.println("Wynik mnożenia " + liczba1 + " oraz " + liczba2 + " daje wynik " + e);
        System.out.println("Wynik dzielenia " + liczba1 + " oraz " + liczba2 + " daje wynik " + f);
        System.out.println("Wynik podniesienia " + liczba1 + " do potęgi " + liczba2 + " daje wynik " + g);
    }

    public static void zadanie4a()
    {
        wykonajObliczenia(3,4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj l1");
        int l1 = scanner.nextInt();
        System.out.println("Podaj l2");
        int l2 = scanner.nextInt();

        wykonajObliczenia(l1, l2);
        wykonajObliczenia(100, 2);
        wykonajObliczenia(2, 2);
    }

    //Zadanie 5
    public static boolean jestParzysta(int liczba) {
        if (liczba % 2 == 0)
            return true;
        else
            return false;
    }

    public static void zadanie5()
    {
        int liczba = 5;
        if(jestParzysta(liczba))
        {
            System.out.println("Liczba " + liczba + " jest parzysta.");
        }
        else
        {
            System.out.println("Liczba " + liczba + " jest nieparzysta.");
        }
    }

    public static void zadanie5a(int liczba)
    {
        if(jestParzysta(liczba))
        {
            System.out.println("Liczba " + liczba + " jest parzysta.");
        }
        else
        {
            System.out.println("Liczba " + liczba + " jest nieparzysta.");
        }
    }

    public static void zadanie5b()
    {
        Scanner scanner = new Scanner(System.in);
        zadanie5a(scanner.nextInt());
    }

    public static boolean isEqual(String str)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków do porównania");
        String str1 = scanner.nextLine();

        if(str.equals(str1))
            return true;
        else
            return false;
    }
    public static double convertCtoF (double temp)
    {
        System.out.println("Podaję temperatuję w st. F");
        return (1.8*temp)+32;
    }
    public static double convertFtoC (double temp)
    {
        System.out.println("Podaję temperatuję w st. C");
        return (temp-32)/1.8;
    }
    public static double convertKtoC (double temp)
    {
        System.out.println("Podaję temperatuję w st. C");
        return (temp+273.15);
    }
    public static double convertCtoK (double temp)
    {
        System.out.println("Podaję temperatuję w st. K");
        return (temp-273.15);
    }
    public static double convertKtoF (double temp)
    {
        System.out.println("Podaję temperatuję w st. F");
        return ((temp-273.15)*1.8)+32;
    }
    public static double convertFtoK (double temp)
    {
        System.out.println("Podaję temperatuję w st. F");
        return ((temp-32)+273.15);
    }
}