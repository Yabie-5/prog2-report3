package jp.ac.uryukyu.ie.e205744;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    /**
     * Warriorクラスからオブジェクトを生成し、attackWithWeponSkillを3回実行し、3回ともattackの150%ダメージになっていることを確認する
     * 検証手順
     *  (1)ウォーリアと敵を準備。ウォーリアの攻撃力は敵を一撃で倒せない程度にする。
     *  (2)ウォーリアが敵を三回殴る。
     *  (3)一回の攻撃ごとに、敵が受けたダメージとウォーリアの攻撃力*150%が一致するかを確かめる。
     *      一致していることに期待。これを検証する。
     */
    @Test
    void attackWithWeponSkill() {
        int defaultHeroHp;
        Warrior demowarrior = new Warrior("デモ戦士", 60, 10);
        Enemy slime = new Enemy("スライムもどき", 100, 100);
        for (int i =0 ; i < 3 ; i++){
            defaultHeroHp = slime.hitPoint;
            demowarrior.attackWithWeponSkill(slime);
            assertEquals(defaultHeroHp - slime.hitPoint, (int)(demowarrior.attack*1.5));
        }
    }
}