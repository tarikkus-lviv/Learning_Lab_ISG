package Homework2;

public class Shape {
    private int volume;

    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }

    @Override
    public String toString() {
        return ""+ volume;
    }
}
