package classroom1;

public class GoodPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Good study");
    }

    @Override
    public void read() {
        System.out.println("Good read");
    }

    @Override
    public void write() {
        System.out.println("Good write");
    }

    @Override
    public void relax() {
        System.out.println("Good relax");
    }
}
