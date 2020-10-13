package Homework2;

public class Box {

    private int volume;
    private Shape shape;

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public boolean add(Shape shape){
        if(shape.getVolume() <= this.volume){
            this.volume -= shape.getVolume();
            this.shape = shape;
            return true;
        } else {
            System.out.println("false");
            return false;
        }

    }

    @Override
    public String toString() {
        return "Box{" +
                "volume=" + volume +
                ", shape=" + shape +
                '}';
    }
}
