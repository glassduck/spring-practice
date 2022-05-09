package com.fastcampus.springpractice.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @DisplayName("Java Sort")
    @Test
    void given_list_executing_java_sort() {
        BubbleSort<Integer> javaSort=new BubbleSort<>();

        List<Integer> actual=javaSort.sort(Arrays.asList(3,2,4,5,1));

        assertEquals(Arrays.asList(1,2,3,4,5),actual);
    }
}