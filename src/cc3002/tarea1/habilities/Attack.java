package cc3002.tarea1.habilities;

import cc3002.tarea1.visitor.Visitor;

import java.util.HashMap;

/**
 * @author José Pacheco
 */

public class Attack extends AbstractAbility{
    private int baseDamage;
    private String name;
    private String description;
    private HashMap<String,Integer> cost;

    /**
     * Create a new Attack.
     * @param name atack's name
     * @param baseDamage base damage of the attack
     * @param description description of the attack
     * @param cost cost in energy of the attack
     */
    public Attack(String name, int baseDamage, String description, HashMap<String,Integer> cost) {
        super(name,description,cost);
        this.baseDamage = baseDamage;
    }

    public int getBaseDamage() {
        return this.baseDamage;
    }

    public void accept(Visitor v){
        v.visitAttack(this);
    }
    /**
     * Checks if this attack is equal to another.
     *
     * @param obj Object to compare this attack.
     * @return <code>true</code> if the objects are equal, <code>false</code> otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Attack && ((Attack) obj).getBaseDamage() == baseDamage
                && ((Attack) obj).getName().equals(name) && ((Attack) obj).getDescription().equals(description) && ((Attack) obj).getCost().equals(cost);
    }
}