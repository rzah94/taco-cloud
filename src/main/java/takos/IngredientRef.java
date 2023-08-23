package takos;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table
public class IngredientRef {
    private final String ingredient;
}
