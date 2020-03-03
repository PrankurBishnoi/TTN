package com.im;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {

    @Test
    void shouldReturnMainStringWhenMainStringIsEmpty() {
        // given
        String mainString = " ";
        String subString = "abc";
        String replacementString = "xyz";

        // when
        First first = new First();
        String returnedString = first.replaceSubString(mainString,subString,replacementString);

        // then
        assertEquals(mainString,returnedString);

    }
    @Test
    void shouldReturnMainStringWhensubStringIsNull()
    {
        // given
        String mainString = "ShivamAgarwal ";
        String subString = null;
        String replacementString = "xyz";

        // when
        First first = new First();
        String actual = first.replaceSubString(mainString,subString,replacementString);

        //Then
        assertEquals(mainString,actual);
    }
    @Test
    void shouldReturnMainStringWhenReplacementStringIsNull()  {
        // given
        String mainString = "abcdef";
        String subString = "def";
        String replacementString = null;

        // when
        First first = new First();
        String returnedString = first.replaceSubString(mainString,subString,replacementString);

        // then
        assertEquals(mainString,returnedString);
    }

    @Test
    void shouldReturnNewStringIfMainStringContainsSubString() {
        // given
        String mainString = "Hello World";
        String subString = "World";
        String replacementString = "Newer";
        String expectedString = "Hello Newer";

        // when
        First first = new First();
        String returnedString = first.replaceSubString(mainString,subString,replacementString);

        // then
        assertEquals(expectedString,returnedString);
    }
    @Test
    void shouldReturnOddElementsFromGivenList()
    {
        //Given
        Object [] expected  = {7,3,11};
        Integer [] temp = {2,4,10,7,14,56,3,12,11};
        List<Integer> list = Arrays.stream(temp).collect(Collectors.toList());

        //WhenFirst first = new First();
        First first = new First();
            Object [] actual = first.filterEvenElements(list).toArray();

        //Then
        assertArrayEquals(expected,actual);


    }

    @Test
    void shouldThrowRunTimeExceptionWhwnListIsEmpty()
    {
        //Given
        List<BigDecimal> list = new ArrayList<BigDecimal>();

        //When
        First first = new First();
        Executable exec = ()->first.calculateAverage(list);


        //Then
        assertThrows(RuntimeException.class,exec);

    }

    @Test
    void shouldReturnAverageOfValuesInListWhenListIsNotEmpty()
    {
        //Given
        BigDecimal expected = new BigDecimal(5);
        List<BigDecimal> list = new ArrayList<BigDecimal>();
        list.add(new BigDecimal(3));
        list.add(new BigDecimal(4));
        list.add(new BigDecimal(4));
        list.add(new BigDecimal(4));
        list.add(new BigDecimal(10));

        //When
        First first = new First();
        BigDecimal actual = first.calculateAverage(list);

        //Then
        System.out.println(actual);
        assertEquals(expected,actual);

    }
    @Test
    void shouldReturnTrueWhenStringIsPalindrome()
    {
        //Given
        String givenstr="abbba";

        // when
        First first = new First();
        boolean actual = first.isPallindrome(givenstr);

        //Then
        assertTrue(actual);

    }
    @Test
    void shouldReturnFalseWhenStringIsNotPalindrome()
    {
        //Given
        String givenstr="abbbab";

        // when
        First first = new First();
        boolean actual = first.isPallindrome(givenstr);

        //Then
        assertFalse(actual);

    }



}