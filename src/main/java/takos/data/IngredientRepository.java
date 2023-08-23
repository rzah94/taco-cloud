package takos.data;

import org.springframework.data.repository.CrudRepository;
import takos.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
