package fr.goodfood.dto.composition;

import fr.goodfood.entity.keys.CompositionKey;

public class CompositionCreateDto extends CompositionBase {
    private CompositionKey id;

    public CompositionKey getId(){
        return this.id;
    }

    public void setId(CompositionKey id){
        this.id = id;
    }
}
