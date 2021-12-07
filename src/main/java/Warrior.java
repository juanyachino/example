public class Warrior extends Character {
    public Warrior(String characterName){
        name = characterName;
        HP = 400;
        weapon = "Dual axes";

    }
    @Override
    public void attack() {
        System.out.println(name + " wields their "+ weapon +" and hits the monster!");
    }
    @Override
    public void dodge() {
        System.out.println(name + " uses their axes to parry the enemy's attacks!");
    }
}
