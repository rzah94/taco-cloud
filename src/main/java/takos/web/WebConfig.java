package takos.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }

//    @Bean
//    public ApplicationRunner dataLoader(IngredientRepository repository) {
//        return args -> {
//            repository.save(new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP));
//            repository.save(new Ingredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP));
//            repository.save(new Ingredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN));
//            repository.save(new Ingredient("CARN", "Carnitas", Ingredient.Type.PROTEIN));
//            repository.save(new Ingredient("TMTO", "Diced Tomatoes", Ingredient.Type.VEGGIES));
//            repository.save(new Ingredient("LETC", "Lettuce", Ingredient.Type.VEGGIES));
//            repository.save(new Ingredient("CHED", "Cheddar", Ingredient.Type.CHEESE));
//            repository.save(new Ingredient("JACK", "Monterrey Jack", Ingredient.Type.CHEESE));
//            repository.save(new Ingredient("SLSA", "Salsa", Ingredient.Type.SAUCE));
//            repository.save(new Ingredient("SRCR", "Sour Cream", Ingredient.Type.SAUCE));
//        };
//    }
}
