package fr.goodfood.dto.formule;

public class FormuleUpdateDto extends FormuleBase{
    private Long id;

    public Long getId(){
        return this.id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
}
