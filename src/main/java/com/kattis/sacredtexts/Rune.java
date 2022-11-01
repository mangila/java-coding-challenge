package com.kattis.sacredtexts;

import java.util.EnumSet;
import java.util.List;

enum Rune {

    EXCLAMATION_MARK("!", 1, 33),
    DOUBLE_QUOTE("\"", 2, 34),
    HASH_TAG("#", 3, 35),
    DOLLAR_SIGN("$", 4, 36),
    MODULUS("%", 5, 37),
    AMPERSAND("&", 6, 38),
    SINGLE_QUOTE("'", 7, 39),
    PARENTHESES_LEFT("(", 8, 40),
    PARENTHESES_RIGHT(")", 9, 41),
    ASTERISK("*", 10, 42),
    PLUS("+", 11, 43),
    COMMA(",", 12, 44),
    MINUS("-", 13, 45),
    DOT(".", 14, 46),
    BACK_SLASH("/", 15, 47),
    ZERO("0", -1, 48),
    LESS_THAN("<", -2, 60),
    GREATER_THAN(">", -3, 62),
    ;

    private final String sign;
    private final int dwarfValue;
    private final int asciiValue;

    Rune(String sign, int dwarfValue, int asciiValue) {
        this.sign = sign;
        this.dwarfValue = dwarfValue;
        this.asciiValue = asciiValue;
    }

    static Rune fromAsciiValue(Integer asciiValue) {
        return EnumSet.allOf(Rune.class)
                .stream()
                .filter(rune -> rune.asciiValue == asciiValue)
                .findFirst()
                .orElseThrow();
    }

    static Integer getDwarfValueSum(List<Rune> runes) {
        return runes.stream()
                .map(Rune::getDwarfValue)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public String getSign() {
        return sign;
    }

    public int getDwarfValue() {
        return dwarfValue;
    }

    public int getAsciiValue() {
        return asciiValue;
    }
}
