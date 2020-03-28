package com.siit.strings;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class StringManipulationTest {

    private StringManipulation sut;

    @Test
    public void given_empty_input_when_compute_inverse_then_empty_is_returned() {
        //Given
        String input = "";

        //When
        String returnedString = sut.reverseString(input);

        //Then
        assertThat(returnedString).isEmpty();
    }

    @Test
    public void given_null_input_when_compute_inverse_then_null_is_returned() {
        //Given
        String input = null;

        //When
        String returnedString = sut.reverseString(input);

        //Then
        assertThat(returnedString).isNull();
    }

    @Test
    public void given_string_input_when_compute_inverse_then_inverse_is_returned() {
        //Given
        String input = "abcdefg";

        //When
        String returnedString = sut.reverseString(input);

        //Then
        assertThat(returnedString).isEqualTo("gfedcba");
    }

    @Test
    public void given_string_with_spaces_input_when_compute_inverse_then_inverse_is_returned() {
        //Given
        String input = "abc_   defg  ";

        //When
        String returnedString = sut.reverseString(input);

        //Then
        assertThat(returnedString).isEqualTo(new StringBuilder(input).reverse().toString());
    }

    @Before
    public void setup() {
        sut = new StringManipulation();
    }


}
