import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Random rnd = new Random(date.getTime());
        // Создание студентов со случайными качествами
        Griffindorf student_1 = new Griffindorf("Гарри", "Поттер", (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));
        Griffindorf student_2 = new Griffindorf("Гермиона", "Грейнджер", (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));
        Griffindorf student_3 = new Griffindorf("Рон", "Уизли", (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));

        Puffenduj student_4 = new Puffenduj("Захария", "Смит", (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));
        Puffenduj student_5 = new Puffenduj("Седрик", "Диггори", (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));
        Puffenduj student_6 = new Puffenduj("Джасти", "Финч-Флетчли", (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));

        Cogtevran student_7 = new Cogtevran("Чжоу", "Чанг", (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));
        Cogtevran student_8 = new Cogtevran("Падма", "Патил", (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));
        Cogtevran student_9 = new Cogtevran("Маркус", "Бэлби", (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));

        Slizerin student_10 = new Slizerin("Драко", "Малфой", (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));
        Slizerin student_11 = new Slizerin("Грэхэм", "Монтегю", (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));
        Slizerin student_12 = new Slizerin("Грегори", "Гойл", (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));
        System.out.println("***************************************************************");
        // Демонстрация метода для вывода описания студента
        System.out.println("Демонстрация метода для вывода описания студента");
        printStudent(student_1);
        System.out.println("***************************************************************");
        System.out.println("Демонстрация сравнения студентов по факультетам");
        // Сравнение студентов по факультетам

        System.out.println("Сумма качеств " + student_1.GetName() + " " + student_1.summOfProperties());

        System.out.println("Сумма качеств " + student_2.GetName() + " " + student_2.summOfProperties());

        System.out.println("Сумма качеств " + student_3.GetName() + " " + student_3.summOfProperties());
        student_1.compare(student_2);
        student_3.compare(student_1);

        System.out.println("Сумма качеств " + student_4.GetName() + " " + student_4.summOfProperties());
        System.out.println("Сумма качеств " + student_5.GetName() + " " + student_5.summOfProperties());
        System.out.println("Сумма качеств " + student_6.GetName() + " " + student_6.summOfProperties());
        student_4.compare(student_5);
        student_4.compare(student_6);

        System.out.println("Сумма качеств " + student_7.GetName() + " " + student_7.summOfProperties());
        System.out.println("Сумма качеств " + student_8.GetName() + " " + student_8.summOfProperties());
        System.out.println("Сумма качеств " + student_9.GetName() + " " + student_9.summOfProperties());
        student_7.compare(student_8);
        student_7.compare(student_9);

        System.out.println("Сумма качеств " + student_10.GetName() + " " + student_10.summOfProperties());
        System.out.println("Сумма качеств " + student_11.GetName() + " " + student_11.summOfProperties());
        System.out.println("Сумма качеств " + student_12.GetName() + " " + student_12.summOfProperties());
        student_10.compare(student_11);
        student_10.compare(student_12);

        System.out.println("***************************************************************");
        System.out.println("Демонстрация случайного сравнения студентов");

        Hogwarts[] arrOfStudents = new Hogwarts[]{student_1, student_2, student_3, student_4, student_5, student_6,
        student_7, student_8, student_9, student_10, student_11, student_12};


        int numberStudent;
        // Сравнение случайных студентов
        for (int i = 0; i < 12; i++) {
            numberStudent = rnd.nextInt(12);
            if(i == numberStudent){
                i--;
                continue;
            }
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Сила магии " + arrOfStudents[i].GetName() + " -> " + arrOfStudents[i].GetWitchcraft());
            System.out.println("Сила магии " + arrOfStudents[numberStudent].GetName() + " -> " + arrOfStudents[numberStudent].GetWitchcraft());
            arrOfStudents[i].compareWitchcraft(arrOfStudents[numberStudent]);
            System.out.println("Расстояние действия магии " + arrOfStudents[i].GetName() + " -> " + arrOfStudents[i].GetTransgress());
            System.out.println("Расстояние действия магии " + arrOfStudents[numberStudent].GetName() + " -> " + arrOfStudents[numberStudent].GetTransgress());
            arrOfStudents[i].compareTransgress(arrOfStudents[numberStudent]);
        }

    }


    public static void printStudent(Object student){
        System.out.println(student.toString());
    }



}