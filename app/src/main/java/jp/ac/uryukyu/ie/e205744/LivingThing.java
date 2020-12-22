package jp.ac.uryukyu.ie.e205744;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name キャラクターの名
     * @param maximumHP キャラクターのHP
     * @param attack キャラクターの攻撃力
     */
    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * キャラクターの名前を教えてくれるgetterメソッド。
     * @return キャラクターの名前を返す
     */
    public String getName(){
        return this.name;
    }

    /**
    * キャラクターの状態（生死）を教えてくれるメソッド。
    * @return キャラクターの状態（生死）を返す
    */
    public boolean isDead(){
        return this.dead;   
    }
    /**
     * キャラクターのHPを教えてくれるgetterメソッド。
     * @return キャラクターのHPを返す
     */
    public int getHitPoint(){
        return this.hitPoint;
    } 

    /**
     * キャラクターの攻撃力を教えてくれるgetterメソッド。
     * @return キャラクターの攻撃力を返す
     */
    public int getAttack(){
        return this.attack;
    }

    /**
     * キャラクターへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     */    
    public void attack(LivingThing opponent){
        if(this.dead == false){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
        }
    }

    /**
     * キャラクターが攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ){
            dead = true;
            System.out.printf("%sは倒れた。\n", getName());
        }
    }

	public void attackWithWeponSkill(LivingThing enemy) {} 
   
}