import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TDDTest {
    @Test
    public void instantiateClass(){
        TDD tdd = new TDD();
    }

    @Test
    public void callMethod(){
        TDD tdd=new TDD();
        tdd.fahrenheitToCelsius(100);
        System.out.println(tdd.fahrenheitToCelsius(100));
    }


    @Test
    public void callMethod2(){
        TDD tdd=new TDD();
        System.out.println(tdd.celsiusToFahrenheit(50));
    }

    @Test
    public void methodReturnsAnDouble(){
        TDD tdd=new TDD();
        Double doublee = tdd.fahrenheitToCelsius(104);
    }
}
