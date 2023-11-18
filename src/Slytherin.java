public class Slytherin extends Hogwarts{
    public int cunning;
    public int determination;
    public int ambition;
    public int resourcefulness;
    public int thirstForPower;

    public Slytherin(String name, int magicPower, int distance, int cunning,
                     int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, distance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;

    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public void bestStudentSlytherin(Slytherin student){
        if(this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower
        > student.cunning + student.determination + student.ambition + student.resourcefulness + student.thirstForPower){
            System.out.println(this.getName() + " куда лучший Слизоринец, чем " + student.getName());
        } else if (this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower
                < student.cunning + student.determination + student.ambition + student.resourcefulness + student.thirstForPower){
            System.out.println(student.getName() + " куда лучший Слизоринецец, чем " + this.getName());
        } else {
            System.out.println("Оба ученика одинаково хорошие ученики Слизорина.");
        }
        System.out.println();
    }


}
