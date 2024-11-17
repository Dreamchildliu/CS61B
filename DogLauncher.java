package lec2_intro2;

public class DogLauncher {
    public static void main(String[] args) {
        Dog tom = new Dog(10);
        Dog lili = new Dog(140);
        Dog larger = tom.maxDog(lili);
        larger.makeNoice();
    }
}
