public class Gryffindor extends Hogwarts{
    public int nobility;
    public int honor;
    public int brave;

    public Gryffindor(String name, int magicPower, int distance, int nobility, int honor, int brave){
        super(name, magicPower, distance);
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBrave() {return brave;}

    public void setBrave(int brave) {
        this.brave = brave;
    }

    public void bestStudentGryffindor(Gryffindor student){
        if(this.honor + this.brave + this.nobility > student.honor + student.brave + student.nobility){
            System.out.println(this.getName() + " куда лучший Грффиндорец, чем " + student.getName());
        } else if (this.honor + this.brave + this.nobility < student.honor + student.brave + student.nobility){
            System.out.println(student.getName() + " куда лучший Грффиндорец, чем " + this.getName());
        } else {
            System.out.println("Оба ученика одинаково хорошие ученики Гриффиндора.");
        }
        System.out.println();
    }

}
