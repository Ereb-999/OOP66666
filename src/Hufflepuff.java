public class Hufflepuff extends Hogwarts {
    public int hardworking;
    public int loyal;
    public int honest;

    public Hufflepuff(String name, int magicPower, int distance, int hardworking, int loyal, int honest) {
        super(name, magicPower, distance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public void bestStudentHufflepuff(Hufflepuff student){
        if(this.hardworking + this.loyal + this.honest > student.hardworking + student.loyal + student.honest){
            System.out.println(this.getName() + " куда лучший Пуффендуец, чем " + student.getName());
        } else if (this.hardworking + this.loyal + this.honest < student.hardworking + student.loyal + student.honest){
            System.out.println(student.getName() + " куда лучший Пуффендуец, чем " + this.getName());
        } else {
            System.out.println("Оба ученика одинаково хорошие ученики Пуффендуя.");
        }
        System.out.println();
    }
}

