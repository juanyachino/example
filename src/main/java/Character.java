public abstract class Character {
    String name;
    int posX = 1;
    int posY = 1;
    int HP;
    String weapon;
    int gold = 0;

    public final void fight(){
        findMonster();
        attack();
        dodge();
        usePotion();
        pickUpGold();
        move();
    }
    public void findMonster(){
        while (!isEnemyOnSight()){
            System.out.println("finding monsters..");
        }
        System.out.println("monster found!");
    }

    public abstract void attack();
    public abstract void dodge();
    public void usePotion(){
        HP += 20;
        System.out.println(name + " consumes a potion to recover some hp!");
    }
    public  void pickUpGold(){
        gold = (int) (Math.random() * 1000) + 500;
        System.out.println(name + " picked up "+ gold + " gold!");
    }
    public void move(){
        posX = (int) (Math.random() * 100) + 1;
        posY = (int) (Math.random() * 100) + 1;
    }

    private boolean isEnemyOnSight() {
        return (int) (Math.random() * 11 + 1) % 2 == 0;
    }
}