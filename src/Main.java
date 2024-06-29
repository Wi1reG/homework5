//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //1 задание


        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //2 задание

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //3 задание

        for (int i = 2; i < 17; i = i + 2) {
            System.out.println(i);
        }

        //4 задание

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //5 задание

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        //6 задание

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        //7 задание

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        //8 задание

        int sum = 29000;
        int sumMonth = 0;
        for (int i = 1; i <= 12; i++) {
            sumMonth = sumMonth + sum;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumMonth + " рублей");
        }

        //9 задание

        int Month = 0;
        int percentMonth = sum + sum / 100;
        for (int i = 1; i <= 12; i++) {
            Month = Month + percentMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + Month + " рублей");
        }

        //10 задание

        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = 2 * i;
            System.out.println("2 * " + i + " = " + result);
        }
    }
}
