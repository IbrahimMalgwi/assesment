package left_rotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {
        public static List<Integer> rotLeft(List<Integer> a, int d) {
        int n = a.size();

        List<Integer> rotated = new ArrayList<>(n);


        for (int i = 0; i < n; i++) {
            int newIndex = (i + d) % n;
            rotated.add(a.get(newIndex));
        }

        return rotated;
    }
}
