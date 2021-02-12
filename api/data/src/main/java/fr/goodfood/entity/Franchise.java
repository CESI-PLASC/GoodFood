package fr.goodfood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Objects;

@Entity
public class Franchise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "designation")
    private String designation;

    @Column(name = "estSupprime")
    private int estSupprime;

    @ManyToMany(targetEntity = Categorie.class)
    @JoinTable(
            name = "fcategorie",
            joinColumns = @JoinColumn(name = "franchise_id"),
            inverseJoinColumns = @JoinColumn(name = "categorie_id")
    )
    private List<Categorie> categories;

    @OneToMany(targetEntity = Commande.class, mappedBy = "franchise")
    private List<Commande> commandes;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Franchise franchise = (Franchise) o;
        return estSupprime == franchise.estSupprime && Objects.equals(id, franchise.id) && Objects.equals(designation, franchise.designation) && Objects.equals(categories, franchise.categories) && Objects.equals(commandes, franchise.commandes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, estSupprime, categories, commandes);
    }

    @Override
    public String toString() {
        return "Franchise{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", estSupprime=" + estSupprime +
                ", categories=" + categories +
                ", commandes=" + commandes +
                '}';
    }
}
