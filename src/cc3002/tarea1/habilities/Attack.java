package cc3002.tarea1.habilities;

import cc3002.tarea1.effects.IEffect;
import cc3002.tarea1.visitor.Visitor;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author José Pacheco
 */

public class Attack extends AbstractAbility{
    private int baseDamage;

    /**
     * Create a new Attack.
     * @param name atack's name
     * @param baseDamage base damage of the attack
     * @param description description of the attack
     * @param cost cost in energy of the attack
     */
    public Attack(String name, int baseDamage, String description, HashMap<String,Integer> cost, IEffect effect) {
        super(name,description,cost,effect);
        this.baseDamage = baseDamage;
    }

    public int getBaseDamage() {
        return this.baseDamage;
    }

    public void accept(Visitor v){
        v.visitAttack(this);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attack)) return false;
        Attack attack = (Attack) o;
        return getBaseDamage() == attack.getBaseDamage();
    }

}