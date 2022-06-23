public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Задание № 1:");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        // Task 2
        System.out.println("Задание № 2:");
        for (int friday = 1; friday <= 31; friday++) {
            if (friday % 7 == 0)
                System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println();
        // Task 3
        System.out.println("Задание № 3:");
        for (int year = 2022; year < 2122; year++) {
            if (year % 79 == 0)
                System.out.println(year);
        }
        for (int year = 2022; year > 1822; year--) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}