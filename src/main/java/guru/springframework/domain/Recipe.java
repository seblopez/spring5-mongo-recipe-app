package guru.springframework.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 6/13/17.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Recipe {

    @Id
    private String id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;

    @Builder.Default
    private List<Ingredient> ingredients = new ArrayList<>();

    private Byte[] image;

    @Builder.Default
    private Difficulty difficulty = Difficulty.EASY;

    private Notes notes;

    @Builder.Default
    @DBRef
    private List<Category> categories = new ArrayList<>();

    public void setNotes(Notes notes) {
        if (notes != null) {
            this.notes = notes;
            // notes.setRecipe(this);
        }
    }

    public Recipe addIngredient(Ingredient ingredient){
        // ingredient.setRecipe(this);
        this.ingredients.add(ingredient);
        return this;
    }
}
