package lec2;

public class Dog {

    public int weightInPounds;

    public Dog(int w) {
        weightInPounds = w;
    }
    public void makeNoice(){
        if (weightInPounds < 10){
            System.out.println("yip yip yip yip!");
        }
        else if (weightInPounds < 30 && weightInPounds > 10){
            System.out.println("Bark!");
        }
        else {
            System.out.println("aroooooo!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2){
        if (d1.weightInPounds > d2.weightInPounds){
            return d1;
        } else {
            return d2;
        }
    }

    public Dog maxDog(Dog d2){
        if (weightInPounds > d2.weightInPounds){
            return this;
        }else {
            return d2;
        }

    }


}
