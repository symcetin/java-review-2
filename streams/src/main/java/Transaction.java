import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Transaction {

    private Trader trader; //has a relationship
    private int year;
    private int value;

}
