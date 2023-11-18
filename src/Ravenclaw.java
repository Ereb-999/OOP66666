public class Ravenclaw extends Hogwarts{
    public int smart;
    public int wise;
    public int witty;
    public int creativity;

    public Ravenclaw(String name, int magicPower, int distance, int smart, int wise, int witty, int creativity) {
        super(name, magicPower, distance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void bestStudentRavenclaw (Ravenclaw  student){
        if(this.smart + this.wise  + this.witty + this.creativity > student.smart + student.wise  + student.witty + student.creativity){
            System.out.println(this.getName() + " куда лучший Когтевранец, чем " + student.getName());
        } else if (this.smart + this.wise  + this.witty + this.creativity < student.smart + student.wise  + student.witty + student.creativity){
            System.out.println(student.getName() + " куда лучший Когтевранец, чем " + this.getName());
        } else {
            System.out.println("Оба ученика одинаково хорошие ученики Когтеврана.");
        }
        System.out.println();
    }
}
