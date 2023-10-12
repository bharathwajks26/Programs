class Superclass {
    int num1 = 10;
    void display() {
        System.out.println("This is the display method of Superclass");
    }
}

class Subclass extends Superclass {
    int num = 20;
    void display() {
        System.out.println("This is the display method of Subclass");
    }
}

public class superclassimp {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.display();
        System.out.println("Value of num in Subclass: " + obj.num);
        Superclass superObj = new Subclass();
        superObj.display();
        System.out.println("Value of num in Superclass: " + obj.num1);
    }
}