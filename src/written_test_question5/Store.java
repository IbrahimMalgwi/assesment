package written_test_question5;

import java.util.HashMap;
import java.util.Map;

public class Store {
    int id;
    Map<Store, Double> connections;
    public Store(int num) {
        id = num;
        this.connections = new HashMap<>();
    }

    public void addConnection(Store store, double probability) {
        connections.put(store, probability);
    }
}
