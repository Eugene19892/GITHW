package lesson01;

public class HW1 {
}
//метод 1
    //   public static void main(String[] args){
//
//        int a = 1;
//        int b = 2;
//        int c = 3;
//        int d = 4;
//        float result;
//
//        result = a * (b + (c / d));
//
//        result = calculate(a, b, c, d);
//
//        System.out.println(result);
//
//
//    }
//
//    public static float calculate(int valueA, int valueB, int valueC, int valueD) {
//        return valueA * (valueB + ((float)valueC / valueD));
//
//
//    }
//}


//    метод 2
//    static boolean myMath(int a, int b) {
//
//        int sum = a + b;
//        if (sum >= 10 && sum <= 20) return true;
//        else return false;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(myMath(1, 15));
//    }
//}

    //метод 3
    public static void main(String[] args) {

        int a = 3, b = 3, c = 0;

        c = a - b; // с = 3 - 3 = 0
        System.out.println("с = " + c);
        if (c >= 0) {
            System.out.println("с не отрицательно");
        }
        if (c < 0) {

        }
    }
}


//метод 4

//public static void main(String[] args) {
//
//    doSomething1();
//}
//public static void doSomething1() {
//        System.out.println("Hello, Eugene");
//    }
//



//}


// Просто созданные переменные
        int varOne = 1;
                int varTwo = 2;
                int varThree = 3;
                int varFour = 4;

                float fOne = 1f;
                float fTwo = 2f;
                float fThree = 3f;
                float fFour = 4.0f;

                System.out.println("Результат задания 1: " + calculate(varOne, varTwo, varThree, varFour));

                System.out.println("Перезагрузка метода задания 1: " + calculate(fOne, fTwo, fThree, fFour));

                System.out.println("Результат второго задания 2 " + checkNumbers(1, 15));

                if (isPositive(-5)) {
                System.out.println("Результат второго задания 3 = Number is positive");
                } else {
                System.out.println("Результат второго задания 3 = Number is negative");
                }

                System.out.println("Результат второго задания 4 " + welcome("Somename"));

                System.out.println("Результат второго задания 5. Год викосоный? " + isLeapYear(-1852));

                }

/*
 * Написать метод вычисляющий выражение a * (b + (c / d)) и
 * возвращающий результат, где a,b,c,d – входные параметры этого метода.
 */
public static float calculate(int a, int b, int c, int d) {
//        return a * (b + (c * 1.0f / d));
        return a * (b + ((float) c / d));
        }

public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
        }

public static float calculate(float a, float b, float c) {
        return a * (b + c);
        }

/*
 * Написать метод, принимающий на вход два числа, и проверяющий
 * что их сумма лежит в пределах 10 до 20, если да – вернуть true,
 * в противном случае – false.
 */
public static boolean checkNumbers(int first, int second) {
//        int sum = first + second;
//        return (sum <= 20) && (sum >= 10);
        return (first + second <= 20) && (first + second >= 10);
        }

/*
 * Написать метод, которому в качестве параметра передаётся целое число,
 * метод должен напечатать в консоль положительное-ли число передали
 * или отрицательное; Замечание: ноль считаем положительным числом.
 */
public static boolean isPositive(int variable) {
        return variable >= 0;
        }

/*
 * Написать метод, которому в качестве параметра передаётся строка,
 * обозначающая имя, метод должен вывести в консоль сообщение "Привет, указанное_имя!"
 */
public static String welcome(String name) {
//        System.out.println("Привет, " + name + " !");
        return "Привет, " + name + "!";
        }

public static void welcome(float inbox) {
        System.out.println("Привет, " + inbox + " !");
        }

/*
 * Написать метод, который определяет является ли год високосным.
 * Каждый 4-й год является високосным, кроме каждого 100-го,
 * при этом каждый 400-й – високосный.
 */
public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        }
        }
