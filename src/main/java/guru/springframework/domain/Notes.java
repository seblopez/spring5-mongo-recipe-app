package guru.springframework.domain;

import lombok.*;

import java.util.UUID;


/**
 * Created by jt on 6/13/17.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Notes {

    @Builder.Default
    private String id = UUID.randomUUID().toString();
    private Recipe recipe;
    private String recipeNotes;

}
