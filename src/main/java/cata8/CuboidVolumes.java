package cata8;

public class CuboidVolumes {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int powerFirstCuboid = powerCuboid(firstCuboid);
        int powerSecondCuboid = powerCuboid(secondCuboid);

        return powerFirstCuboid >= powerSecondCuboid
                ? powerFirstCuboid - powerSecondCuboid
                : powerSecondCuboid - powerFirstCuboid;
    }

    private static int powerCuboid(final int[] cuboid) {
        int start = 1;
        for (int i : cuboid) {
            start = start * i;
        }
        return start;
    }}
