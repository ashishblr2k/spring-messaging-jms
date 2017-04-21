package hello;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by agup101 on 4/20/2017.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {

    private String to;
    private String body;

}
