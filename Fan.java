public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;

    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }
    public int getSpeed() {
        return speed;
    }
    public boolean getOn() {
        return on;
    }
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
         this.speed = speed;
    }

    public void turnOn() {this.on = true;}
    public void turnOff() { on = false; }

    public void setRadius(double r) {
        radius = r;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return "fan = {status: " + on + ", speed: " + speed + ", color: " + color + ", radius: " + radius + "}";
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.turnOn();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");


        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.turnOff();

        System.out.println("Fan1 info: " + fan1.toString());
        System.out.println("Fan2 info: " + fan2.toString());
    }

}
