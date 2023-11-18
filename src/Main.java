public class Main {
    public static void main(String[] args) {
        Gryffindor[] studentsGryffindor = {
                new Gryffindor("Гарри Поттер", 70, 24, 45, 20, 76),
                new Gryffindor("Гермиона Грейнджер", 46, 23, 56, 63, 25 ),
                new Gryffindor("Рон Уизли", 64, 42, 14, 63, 13)
        };
        Hufflepuff[] studentsHufflepuff = {
                new Hufflepuff("Захария Смит", 57, 63, 46, 13, 45),
                new Hufflepuff("Седрик Диггори", 56, 23, 14, 76, 32),
                new Hufflepuff("Джастин Финч-Флетчли", 45, 12, 57, 86, 21)
        };
        Ravenclaw[] studentsRavenclaw = {
                new Ravenclaw("Чжоу Чанг", 24, 53, 45, 76, 52, 56),
                new Ravenclaw("Падма Патил", 10, 42, 35, 64, 11, 23),
                new Ravenclaw("Маркус Белби", 45, 65, 21, 65, 74, 21)
        };
        Slytherin[] studentsSlytherin = {
                new Slytherin("Драко Малфой", 78,39,56,74,93,63,63),
                new Slytherin("Грэхэм Монтегю", 13,24,25,45,12,45,11),
                new Slytherin("Грегори Гойл",54,13,67,3,89,81,24)
        };



      PrintHogwarts printHogwarts = new PrintHogwarts();
      printHogwarts.print(studentsGryffindor);
      printHogwarts.print(studentsHufflepuff);
      printHogwarts.print(studentsRavenclaw);
      printHogwarts.print(studentsSlytherin);
      studentsGryffindor[0].bestStudentGryffindor(studentsGryffindor[2]);
      studentsHufflepuff[2].bestStudentHufflepuff(studentsHufflepuff[0]);
      studentsRavenclaw[1].bestStudentRavenclaw(studentsRavenclaw[0]);
      studentsSlytherin[2].bestStudentSlytherin(studentsSlytherin[1]);
      studentsGryffindor[1].bestStudentHogwarts(studentsHufflepuff[0]);

    }
}