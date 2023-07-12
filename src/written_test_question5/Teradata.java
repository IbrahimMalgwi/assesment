package written_test_question5;

import java.util.*;

public class Teradata {
    private List<Store> storages;

    public Teradata() {
        storages = new ArrayList<>();
    }

    public void addStorage(Store store) {
        storages.add(store);
    }

    public Store getStorage(int id) {
        return storages.get(id - 1);
    }

    public boolean canTransmitPacket(Store source, Store destination, double threshold) {
        Set<Store> visited = new HashSet<>();
        return dfs(source, destination, threshold, visited);
    }

    private boolean dfs(Store current, Store destination, double threshold, Set<Store> visited) {
        if (current == destination) {
            return true;
        }

        visited.add(current);


        for (Map.Entry<Store, Double> entry : current.connections.entrySet()) {
            Store neighbor = entry.getKey();
            double probability = entry.getValue();
            if (!visited.contains(neighbor) && probability >= threshold) {
                if (dfs(neighbor, destination, threshold, visited)) {
                    return true;
                }
            }
        }

        return false;

    }
}
