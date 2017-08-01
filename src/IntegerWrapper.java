/**
 * Created by gilpratte on 8/1/17.
 */
public class IntegerWrapper {

    private Integer integer;

    public IntegerWrapper(Integer integer) {
        this.integer = integer;
    }

    public float floatValue() {
        return integer.floatValue();
    }
}
