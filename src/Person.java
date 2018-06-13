/**
 * Created by Cooper on 6/7/2017.
 */
public class Person {
    private int $filingStatus;
    private float $taxableIncome;
    private float $taxOwed = 0;
    public int get$filingStatus() {
        return $filingStatus;
    }

    public void set$filingStatus(int $filingStatus) {
        this.$filingStatus = $filingStatus;
    }

    public float get$taxOwed() {
        return $taxOwed;
    }

    public void set$taxOwed(float $taxOwed) {
        this.$taxOwed = $taxOwed;
    }

    public float get$taxableIncome() {
        return $taxableIncome;
    }

    public void set$taxableIncome(float $taxableIncome) {
        this.$taxableIncome = $taxableIncome;
    }
}
