package com.siit.exceptions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

@RunWith(MockitoJUnitRunner.class)
public class PlayWithExceptionsTest {


   private PlayWithExceptions sut  = new PlayWithExceptions();

    @Test
    public void given_dangerous_method_when_is_calles_then_will_throw_custom_exception(){
        //Given

        //When
        Throwable thrown = catchThrowable(
                ()-> sut.dangerousMethod()
        );

        //Then
        assertThat(thrown).isInstanceOf(OurCustomUncheckedException.class);
        assertThat(thrown).hasMessage("We are fucked up");
    }
}
