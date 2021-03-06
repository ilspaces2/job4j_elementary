package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort5Nums() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3Nums() {
        int[] data = new int[]{3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort10Nums() {
        int[] data = new int[]{3, 4, 1, 5, 8, 3, 2, 8, 10, 20};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 3, 4, 5, 8, 8, 10, 20};
        Assert.assertArrayEquals(expected, result);
    }
}