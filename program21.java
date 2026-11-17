interface Switchable {

    // Two methods declared in interface
    void turnOn();
    void turnOff();
}

// First class
class Light implements Switchable {

    public void turnOn() {
        System.out.println("Light is ON - Brightness activated.");
    }

    public void turnOff() {
        System.out.println("Light is OFF.");
    }
}

// Second class
class AC implements Switchable {

    public void turnOn() {
        System.out.println("AC is ON - Cooling started.");
    }

    public void turnOff() {
        System.out.println("AC is OFF - Cooling stopped.");
    }
}

// Third class
class Fan implements Switchable {

    public void turnOn() {
        System.out.println("Fan is ON - Fan is rotating.");
    }

    public void turnOff() {
        System.out.println("Fan is OFF - Fan stopped.");
    }
}

// Fourth class added later
class Television implements Switchable {

    public void turnOn() {
        System.out.println("TV is ON - Display started.");
    }

    public void turnOff() {
        System.out.println("TV is OFF - Display stopped.");
    }
}

public class program21 {

    public static void main(String[] args) {

        // Array of interface type
        Switchable[] devices = {
            new Light(),
            new AC(),
            new Fan(),
            new Television()
        };

        // Calling methods using loop
        for (int i = 0; i < devices.length; i++) {

            System.out.println("\nDevice " + (i + 1));

            devices[i].turnOn();
            devices[i].turnOff();
        }
    }
}
