import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Random rnd = new Random(date.getTime());
        // Создание студентов со случайными качествами
        GriffindorfStudent student_1 = new GriffindorfStudent("Гарри", "Поттер", (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));
        GriffindorfStudent student_2 = new GriffindorfStudent("Гермиона", "Грейнджер", (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));
        GriffindorfStudent student_3 = new GriffindorfStudent("Рон", "Уизли", (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));



        PuffendujStudent student_4 = new PuffendujStudent("Захария", "Смит", (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));
        PuffendujStudent student_5 = new PuffendujStudent("Седрик", "Диггори", (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));
        PuffendujStudent student_6 = new PuffendujStudent("Джасти", "Финч-Флетчли", (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));

        CogtevranStudent student_7 = new CogtevranStudent("Чжоу", "Чанг", (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));
        CogtevranStudent student_8 = new CogtevranStudent("Падма", "Патил", (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));
        CogtevranStudent student_9 = new CogtevranStudent("Маркус", "Бэлби", (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));

        SlizerinStudent student_10 = new SlizerinStudent("Драко", "Малфой", (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));
        SlizerinStudent student_11 = new SlizerinStudent("Грэхэм", "Монтегю", (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));
        SlizerinStudent student_12 = new SlizerinStudent("Грегори", "Гойл", (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1), (rnd.nextInt(100)+1),
                (rnd.nextInt(100)+1), (rnd.nextInt(100)+1));
        System.out.println("***************************************************************");
        // Демонстрация метода для вывода описания студента
        System.out.println("Демонстрация метода для вывода описания студента");
        student_1.printStudent();
        System.out.println("***************************************************************");
        System.out.println("Демонстрация сравнения студентов по факультетам");
        // Сравнение студентов по факультетам

        System.out.println("Сумма качеств " + student_1.getName() + " " + student_1.summOfProperties());

        System.out.println("Сумма качеств " + student_2.getName() + " " + student_2.summOfProperties());

        System.out.println("Сумма качеств " + student_3.getName() + " " + student_3.summOfProperties());
        student_1.compare(student_2);
        student_3.compare(student_1);

        System.out.println("Сумма качеств " + student_4.getName() + " " + student_4.summOfProperties());
        System.out.println("Сумма качеств " + student_5.getName() + " " + student_5.summOfProperties());
        System.out.println("Сумма качеств " + student_6.getName() + " " + student_6.summOfProperties());
        student_4.compare(student_5);
        student_4.compare(student_6);

        System.out.println("Сумма качеств " + student_7.getName() + " " + student_7.summOfProperties());
        System.out.println("Сумма качеств " + student_8.getName() + " " + student_8.summOfProperties());
        System.out.println("Сумма качеств " + student_9.getName() + " " + student_9.summOfProperties());
        student_7.compare(student_8);
        student_7.compare(student_9);

        System.out.println("Сумма качеств " + student_10.getName() + " " + student_10.summOfProperties());
        System.out.println("Сумма качеств " + student_11.getName() + " " + student_11.summOfProperties());
        System.out.println("Сумма качеств " + student_12.getName() + " " + student_12.summOfProperties());
        student_10.compare(student_11);
        student_10.compare(student_12);

        System.out.println("***************************************************************");
        System.out.println("Демонстрация случайного сравнения студентов");

        HogwartsStudent[] arrOfStudents = new HogwartsStudent[]{student_1, student_2, student_3, student_4, student_5, student_6,
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
            System.out.println("Сила магии и трансгрессия " + arrOfStudents[i].getName() + " -> " + arrOfStudents[i].summOfProperties());
            System.out.println("Сила магии и трансгрессия " + arrOfStudents[numberStudent].getName() + " -> " + arrOfStudents[numberStudent].summOfProperties());
            arrOfStudents[i].compare(arrOfStudents[numberStudent]);
        }

    }
}