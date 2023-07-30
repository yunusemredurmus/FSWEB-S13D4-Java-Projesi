public class Player {
    String name;
    int healthPercentage;
    enum Weapon {m4a4 , glock};

    public Player(String name, int healthPercentage, Weapon weaponType) {
        this.name = name;
        if ( healthPercentage >= 0 && healthPercentage<=100) this.healthPercentage=healthPercentage;
        else if (healthPercentage < 0 ) this.healthPercentage = 0;
    }

    public int healthRemaining () {
        return healthPercentage;

    }
    public void loseHealth(int damage) {
        this.healthPercentage -= damage ;
         if ( healthPercentage < 0) this.healthPercentage = 0;
        else if ( healthPercentage < 0) {
            System.out.println(name + "player has been knocked out of game");

        }
    }

    public void restoreHealth(int healthPotion) {
        this.healthPercentage += healthPotion;
        if (healthPercentage > 100) this.healthPercentage = 100;
        System.out.println("Can yükseltildi .");
    }

}
