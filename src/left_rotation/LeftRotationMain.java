package left_rotation;

import java.util.Arrays;
import java.util.List;

import static left_rotation.LeftRotation.rotLeft;

public class LeftRotationMain {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5);
        int rotations = 3;

        List<Integer> rotatedArray = rotLeft(array, rotations);
        System.out.println(rotatedArray);
    }
}
