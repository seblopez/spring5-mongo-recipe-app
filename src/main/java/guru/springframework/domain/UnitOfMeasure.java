package guru.springframework.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Created by jt on 6/13/17.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class UnitOfMeasure {

    private String id;
    private String description;
}
