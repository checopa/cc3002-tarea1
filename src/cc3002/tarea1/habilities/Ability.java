package cc3002.tarea1.habilities;

import cc3002.tarea1.visitor.Visitor;

import java.util.HashMap;

public class Ability extends AbstractAbility {


    /**
     * Create a new ability.
     *
     * @param name        ability's name
     * @param description description of the ability
     * @param cost        cost in energy of the ability
     */
    public Ability(String name, String description, HashMap<String, Integer> cost) {
        super(name, description, cost);
    }

    public void accept(Visitor v){
        v.visitAbility(this);
    }
}
