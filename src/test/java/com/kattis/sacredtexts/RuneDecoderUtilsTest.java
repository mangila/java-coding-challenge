package com.kattis.sacredtexts;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RuneDecoderUtilsTest {

    @Test
    void shouldGetOffsetIsZero() {
        var offset = RuneDecoderUtils.getOffset(List.of(Rune.EXCLAMATION_MARK), 'a');
        assertEquals(0, offset);
    }

    @Test
    void shouldGetOffsetIsTwo() {
        var offset = RuneDecoderUtils.getOffset(List.of(Rune.ASTERISK), 'h');
        assertEquals(2, offset);
    }

    @Test
    void shouldDecodeRuneIsa() {
        var decoded = RuneDecoderUtils.decodeRunes(List.of(Rune.EXCLAMATION_MARK), 0);
        assertEquals('a', decoded);
    }

    @Test
    void shouldDecodeRuneIsh() {
        var decoded = RuneDecoderUtils.decodeRunes(List.of(Rune.ASTERISK), 2);
        assertEquals('h', decoded);
    }

    @Test
    void shouldDecodeRuneIsd() {
        var decoded = RuneDecoderUtils.decodeRunes(List.of(Rune.DOUBLE_QUOTE, Rune.DOUBLE_QUOTE), 0);
        assertEquals('d', decoded);
    }
}