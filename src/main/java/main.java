public class main {
    public static void main(String[] args){
        Character mage = new Mage("Gandalf");
        Character archer = new Archer("Legolas");
        Character warrior = new Warrior("Aragorn");
        mage.fight();
        System.out.println("");
        archer.fight();
        System.out.println("");
        warrior.fight();
        System.out.println("");
    }
}
