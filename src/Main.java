import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2000, distance = 100;
        byte os = 1;
        System.out.println(isLeapYear(year));
        version(os,year);
        Distance(distance);
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public static void version(byte system, int year)
    {
        int currentYear = LocalDate.now().getYear();
        System.out.println("Задание 2");
        System.out.print("Установите ");
        if(year < currentYear)
            System.out.print("облегченную ");
        if(system == 0)
            System.out.println("версию приложения для iOS по ссылке");
        else
            System.out.println("версию приложения для Android по ссылке");

    }
    public static void Distance(int distance)
    {
        System.out.println("Задание 3");
        int countDays=1;
        if(distance > 20)
            countDays++;
        if(distance > 60)
            countDays++;
        if(distance > 100)
            countDays=0;
        System.out.println("Потребуется дней: " + countDays);
    }
}

