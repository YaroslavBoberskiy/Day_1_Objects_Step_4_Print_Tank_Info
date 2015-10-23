public class Demo {

    public static void main(String[] args) {

        Tank t = new Tank();

        printTankInfo(t);

    }

    public static void printTankInfo(Tank t) {
        System.out.println("Tank name: " + t.name + ", Tank color: " + t.color + ", max crew: " + t.maxCrew);
    }

}
