import jp.ac.uryukyu.ie.e205744.*;

public class Main {
    public static void main(String[] args){
        LivingThing warrior = new Warrior("勇者", 10, 5);
        LivingThing enemy = new Enemy("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", warrior.getName(), warrior.getName());

        int turn = 0;
        while( warrior.isDead() == false && enemy.isDead() == false) {
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeponSkill(enemy);
            enemy.attack(warrior);
        }
        System.out.println("戦闘終了");
    }
}