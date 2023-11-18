import java.util.Objects;

public abstract class Hogwarts {
    private final String name;
    private final int magicPower;
    private final int distance;

    public Hogwarts(String name, int magicPower, int distance) {
        this.name = name;
        this.magicPower = magicPower;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }
    public int getMagicPower() {
        return magicPower;
    }
    public int getDistance() {
        return distance;
    }

    public void bestStudentHogwarts(Hogwarts student) {
        if (this.getMagicPower() > student.getMagicPower()) {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + student.getName());
        } else if (this.magicPower== student.magicPower) {
            System.out.println(this.getName() + " обладает такойже мощностью магии как " + student.getName());
        } else{
            System.out.println(student.getName() + " обладает большей мощностью магии, чем " + this.getName());
        }
        if (this.getDistance() > student.getDistance()){
            System.out.println(this.getName() + " облодает болшей силой трансгрессии растояния, чем " + student.getName());
        } else if (this.getDistance()== student.getDistance()) {
            System.out.println(this.getName() + " обладает такойже силой трансгрессии растояния как " + student.getName());
        } else{
            System.out.println(student.getName() + " облодает болшей силой трансгрессии растояния, чем " + this.getName());
        }
        System.out.println();
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, magicPower, distance);
    }

}
