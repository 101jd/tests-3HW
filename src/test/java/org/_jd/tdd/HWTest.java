package org._jd.tdd;

import org._jd.Main;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class HWTest {
    @Test
    public void numberIsEven(){
        assertThat(Main.isEven(4)).isEqualTo(true);
    }

    @Test
    public void numberIsNotEven(){
        assertThat(Main.isEven(3)).isEqualTo(false);
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 50, 100})
    public void numIsInInterval(int i){
        assertThat(Main.isNumberInInterval(i)).isEqualTo(true);
    }

    @ParameterizedTest
    @ValueSource(ints = {24, 101})
    public void numIsNotInInterval(int i){
        assertThat(Main.isNumberInInterval(i)).isEqualTo(false);
    }
}
