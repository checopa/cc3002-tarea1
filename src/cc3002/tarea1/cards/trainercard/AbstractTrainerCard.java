package cc3002.tarea1.cards.trainercard;

import cc3002.tarea1.cards.AbstractCard;

public abstract class AbstractTrainerCard extends AbstractCard implements ITrainerCard {
    private String name;
    private String description;


    protected AbstractTrainerCard(String name,String description){
        super(name);
        this.description=description;
    }


    @Override
    public String getDescription(){
        return this.description;
    }



}
