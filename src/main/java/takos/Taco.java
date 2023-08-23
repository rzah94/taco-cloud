package takos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Taco")
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "createdAt")
    @JsonIgnore
    private Date created_at = new Date();

    @Column(name = "name")
    @NotNull
    @Size(min = 2, message = "Name must be at least 2 characters long")
    private String name;

    @NotNull
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    @ManyToMany(targetEntity = Ingredient.class)
    private List<Ingredient> ingredients;

    public Taco() {
    }

    public Taco(Date created_at, String name, List<Ingredient> ingredients) {
        this.created_at = created_at;
        this.name = name;
        this.ingredients = ingredients;
    }

    public Taco(long id, Date created_at, String name, List<Ingredient> ingredients) {
        this.id = id;
        this.created_at = created_at;
        this.name = name;
        this.ingredients = ingredients;
    }

    public void addIngedient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
