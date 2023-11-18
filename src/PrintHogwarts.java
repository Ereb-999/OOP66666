public class PrintHogwarts {
    public void print(Gryffindor[] studentsGryffindor) {
        for (Gryffindor gryffindor : studentsGryffindor) {
            System.out.println("Студент Гриффиндора: " + gryffindor.getName() +
                    ". Магическая сила: " + gryffindor.getMagicPower() +
                    " балов. Расстояние трансгрессии: " + gryffindor.getDistance() +
                    " балов. Благородстово: " + gryffindor.nobility +
                    " балов. Честь: " + gryffindor.honor +
                    " балов. Храбрость: " + gryffindor.brave + " балов.");
        }
        System.out.println();
    }
    public void print(Hufflepuff[] studentsHufflepuff) {
        for (Hufflepuff hufflepuff : studentsHufflepuff){
            System.out.println("Студент Пуффендуя: " + hufflepuff.getName() +
                    ". Магическая сила: " + hufflepuff.getMagicPower() +
                    " балов. Расстояние трансгрессии: " + hufflepuff.getDistance() +
                    " балов. Трудолюбие: " + hufflepuff.hardworking +
                    " балов. Верность: " + hufflepuff.loyal +
                    " балов. Честность: " + hufflepuff.honest + " балов.");
        }
        System.out.println();
    }
    public void print(Ravenclaw[] studentsRavenclaw) {
        for (Ravenclaw ravenclaw : studentsRavenclaw) {
            System.out.println("Студент Когтеврана: " + ravenclaw.getName() +
                    ". Магическая сила: " + ravenclaw.getMagicPower() +
                    " балов. Расстояние трансгрессии: " + ravenclaw.getDistance() +
                    " балов. Ум: " + ravenclaw.smart +
                    " балов. Мудрост: " + ravenclaw.wise +
                    " балов. Остроумие: " + ravenclaw.witty +
                    " балов. Креативность: " + ravenclaw.creativity + " балов.");
        }
        System.out.println();
    }

    public void print(Slytherin[] studentsSlytherin) {
        for (Slytherin slytherin : studentsSlytherin) {
            System.out.println("Студент Слизорина" + slytherin.getName() +
                            ". Магическая сила: " + slytherin.getMagicPower() +
                            " балов. Расстояние трансгрессии: " + slytherin.getDistance() +
                            " балов. Хитростбю: " + slytherin.cunning +
                            " балов. Решительность: " + slytherin.determination +
                            " балов. Аибициозность: " + slytherin.ambition +
                            " балов. Находчивость: " + slytherin.resourcefulness +
                            " балов. Жажда власти: " + slytherin.thirstForPower + " балов.");
        }
        System.out.println();
    }



}
