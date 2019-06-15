package cc3002.tarea1.cards.trainercard;

import cc3002.tarea1.cards.AbstractCard;
import cc3002.tarea1.effects.IEffect;

public abstract class AbstractTrainerCard extends AbstractCard implements ITrainerCard {
    private String name;
    private String description;
    private IEffect effect;


    protected AbstractTrainerCard(String name, String description, IEffect effect){
        super(name);
        this.description=description;
        this.effect=effect;
    }


    @Override
    public String getDescription(){
        return this.description;
    }



}
