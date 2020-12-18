package objects;

// Brezinys arba blueprintas, kuriop pagalba kursime objektus.
public class Robot {

    // defaultinis konstruktorius isvkieciamas kurimo metu
    public Robot() {
        System.out.println("Robotas yra sukurtas");
    }
    //specifinis konstruktorius
    public Robot(String newColor, String newName, int newWeight) {
        System.out.println("Kitas robotas sukurtas");
        this.color = newColor;
        this.name = newName;
        this.weight = newWeight;
    }

    // apibudiname objekto busena/state

    String color = "Red";
    String name = "Brad";
    int weight = 50;

    // apibudiname behavior/elgsena

    //access modifier, return type, method name, optional - parameters
    public void sayHello() {
        System.out.println("Saying HI as a robot");

        }

//    @Override
//    public String toString() { // komanda to
//        return "Robot{" +
//                "color='" + color + '\'' +
//                ", name='" + name + '\'' +
//                ", weight=" + weight +
//                '}';
//    }

}



