package enemies;

public abstract class Enemy {

    private String name;
    private int healthPoints;
    private int attack;

    public Enemy(String name, int healthPoints, int attack){
        this.name = name;
        this.healthPoints = healthPoints;
        this.attack = attack;
    }

    public void takeDamage(){
    }


}
