package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SearchtaskTest {

    // 1. Target present at beginning (linear)
    @Test
    public void testLinearSearchTargetAtStart() {
        int[] nums = {23, 5, 6, 7};
        assertEquals(0, Searchtask.linearSearch(nums, 23));
    }

    // 2. Target present at end (linear)
    @Test
    public void testLinearSearchTargetAtEnd() {
        int[] nums = {5, 6, 7, 23};
        assertEquals(3, Searchtask.linearSearch(nums, 23));
    }

    // 3. Target not present (linear)
    @Test
    public void testLinearSearchTargetNotFound() {
        int[] nums = {1, 2, 3, 4};
        assertEquals(-1, Searchtask.linearSearch(nums, 10));
    }

    // 4. Empty array (linear)
    @Test
    public void testLinearSearchEmptyArray() {
        int[] nums = {};
        assertEquals(-1, Searchtask.linearSearch(nums, 5));
    }

    // 5. Single element array - target present
    @Test
    public void testLinearSearchSingleElementFound() {
        int[] nums = {23};
        assertEquals(0, Searchtask.linearSearch(nums, 23));
    }

    // 6. Single element array - target absent
    @Test
    public void testLinearSearchSingleElementNotFound() {
        int[] nums = {5};
        assertEquals(-1, Searchtask.linearSearch(nums, 23));
    }

    // 7. Binary search - target in middle
    @Test
    public void testBinarySearchTargetInMiddle() {
        int[] nums = {1, 3, 5, 7, 9};
        assertEquals(2, Searchtask.binaerysearch(nums, 5));
    }

    // 8. Binary search - target at start
    @Test
    public void testBinarySearchTargetAtStart() {
        int[] nums = {1, 3, 5, 7, 9};
        assertEquals(0, Searchtask.binaerysearch(nums, 1));
    }

    // 9. Binary search - target at end
    @Test
    public void testBinarySearchTargetAtEnd() {
        int[] nums = {1, 3, 5, 7, 9};
        assertEquals(4, Searchtask.binaerysearch(nums, 9));
    }

    // 10. Binary search - target not found
    @Test
    public void testBinarySearchTargetNotFound() {
        int[] nums = {1, 3, 5, 7, 9};
        assertEquals(-1, Searchtask.binaerysearch(nums, 6));
    }

    // 11. Binary search recursive - target in middle
    @Test
    public void testBinarySearchRecursiveTargetInMiddle() {
        int[] nums = {1, 3, 5, 7, 9};
        assertEquals(2, Searchtask.binaerysearchrecurcive(nums, 5, 0, nums.length - 1));
    }

    // 12. Binary search recursive - target at start
    @Test
    public void testBinarySearchRecursiveTargetAtStart() {
        int[] nums = {1, 3, 5, 7, 9};
        assertEquals(0, Searchtask.binaerysearchrecurcive(nums, 1, 0, nums.length - 1));
    }

    // 13. Binary search recursive - target at end
    @Test
    public void testBinarySearchRecursiveTargetAtEnd() {
        int[] nums = {1, 3, 5, 7, 9};
        assertEquals(4, Searchtask.binaerysearchrecurcive(nums, 9, 0, nums.length - 1));
    }

    // 14. Binary search recursive - target not found
    @Test
    public void testBinarySearchRecursiveTargetNotFound() {
        int[] nums = {1, 3, 5, 7, 9};
        assertEquals(-1, Searchtask.binaerysearchrecurcive(nums, 6, 0, nums.length - 1));
    }

    // 15. Binary search with duplicates - target present multiple times
    @Test
    public void testBinarySearchWithDuplicates() {
        int[] nums = {1, 3, 3, 3, 5};
        int result = Searchtask.binaerysearch(nums, 3);
        assertTrue(result >= 1 && result <= 3); // any valid index
    }

    // 16. Binary search recursive with duplicates
    @Test
    public void testBinarySearchRecursiveWithDuplicates() {
        int[] nums = {1, 3, 3, 3, 5};
        int result = Searchtask.binaerysearchrecurcive(nums, 3, 0, nums.length - 1);
        assertTrue(result >= 1 && result <= 3);
    }

    // 17. Large array - target present
    @Test
    public void testBinarySearchLargeArrayFound() {
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) nums[i] = i;
        assertEquals(500, Searchtask.binaerysearch(nums, 500));
    }

    // 18. Large array - target not present
    @Test
    public void testBinarySearchLargeArrayNotFound() {
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) nums[i] = i;
        assertEquals(-1, Searchtask.binaerysearch(nums, 2000));
    }

    // 19. Negative numbers in array
    @Test
    public void testBinarySearchNegativeNumbers() {
        int[] nums = {-10, -5, 0, 5, 10};
        assertEquals(1, Searchtask.binaerysearch(nums, -5));
    }

    // 20. Mixed positive and negative numbers, target not found
    @Test
    public void testBinarySearchMixedNumbersNotFound() {
        int[] nums = {-10, -5, 0, 5, 10};
        assertEquals(-1, Searchtask.binaerysearch(nums, 7));
    }
}
