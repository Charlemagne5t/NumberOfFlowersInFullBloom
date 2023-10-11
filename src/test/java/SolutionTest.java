import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void fullBloomFlowersTest1() {
        int[][] flowers = {
                {1, 6},
                {3, 7},
                {9, 12},
                {4, 13},
                {1, 6}
        };
        int[] people = {2, 3, 7, 11};
        int[] expected = {1, 2, 2, 2};
        int[] actual = new Solution().fullBloomFlowers(flowers, people);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void fullBloomFlowersTest2() {
        int[][] flowers = {
                {1, 10},
                {3, 3}
        };
        int[] people = {3, 3, 2};
        int[] expected = {2, 2, 1};
        int[] actual = new Solution().fullBloomFlowers(flowers, people);

        Assert.assertArrayEquals(expected, actual);
    }
}
