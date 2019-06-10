package cc3002.tarea1.cards.trainercard;

public abstract class AbstractTrainerCard implements ITrainerCard {
    private String name;
    private String description;


    protected AbstractTrainerCard(String name,String description){
        this.name=name;
        this.description=description;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public String getDescription(){
        return this.description;
    }



}
