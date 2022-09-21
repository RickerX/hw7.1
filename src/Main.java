public class Main {
    public static void main(String[] args) {
        // Задача 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("ФИО сотрудника — "+fullName);
        System.out.println("ФИО сотрудника — "+lastName + firstName + middleName);
        // Задача 2
        fullName = fullName.replace("Ivanov Ivan Ivanovich", "IVANOV IVAN IVANIVICH");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName);
        // Задача 3
        String fullNameTask3 = "Иванов Семён Семёнович";
        fullNameTask3 = fullNameTask3.replace("ё", "е");
        System.out.println("ФИО сотрудника — "+fullNameTask3);

    }
}