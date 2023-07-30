public class Main {
    public static void main(String[] args) {


        System.out.println("************************");

         Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());


        System.out.println("************************");

        Player Health = new Player("yunus" , 50 , Player.Weapon.glock);

        System.out.println("healt" + Health.healthPercentage);

        Health.loseHealth(10);

        System.out.println("healt" + Health.healthPercentage);

        Health.loseHealth(41);

        System.out.println("healt" + Health.healthPercentage);

        Health.restoreHealth(100);

        System.out.println("Healt" + Health.healthPercentage );
    }
}