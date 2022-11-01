package com.kattis.sacredtexts;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RuneTest {

    @Test
    void fromAsciiValue() {
        assertEquals(Rune.fromAsciiValue(33).getSign(), "!");
        assertEquals(Rune.fromAsciiValue(34).getSign(), "\"");
        assertEquals(Rune.fromAsciiValue(35).getSign(), "#");
    }

    @Test
    void getDwarfValueSum() {
        var sum = Rune.getDwarfValueSum(List.of(Rune.EXCLAMATION_MARK, Rune.ASTERISK));
        assertEquals(11, sum);
    }
}