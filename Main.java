
import Concepts.CoreConcepts;
import Concepts.OrderStatus;

public class Main {
    public static void main(String[] args) {
        CoreConcepts coreConcepts = new CoreConcepts("1", "Core Concepts", OrderStatus.PENDING);
        coreConcepts.PayUsingMethod();

    }
}
