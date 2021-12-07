public class Archer extends Character {
    int arrowCount ;
    public Archer(String characterName){
        name = characterName;
        HP = 150;
        weapon = "Bow";
        arrowCount = 1;
    }
    @Override
    public void attack() {

        System.out.println(name +" wields their " + weapon + " and attacks the monster using arrows!");
        arrowCount--;
        reload();

    }

    @Override
    public void dodge() {
        System.out.println(name + " uses their agility to dodge enemy's attacks!");
    }

    private void reload(){
        arrowCount += 1;
    }
}
