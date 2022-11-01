package com.kattis.sacredtexts;

import java.util.List;

public class RuneDecoderUtils {

    private RuneDecoderUtils() {
        // don't invoke me
    }

    /**
     * e.g. 10 - (104 - 97 + 1) = 2
     * e.g. * - (h - a + 1) = 2
     * @param runes  - collection to get dwarf value sum
     * @param letter - decoded letter to find the offset
     * @return
     */
    public static Integer getOffset(List<Rune> runes, Character letter) {
        var sum = Rune.getDwarfValueSum(runes);
        return sum - (letter - 'a' + 1);
    }

    /**
     * e.g. 97 - 2 - 1 + 10 = h
     * e.g. 97 - 0 - 1 + 1 = a
     *
     * @param runes  - to be decoded
     * @param offset - offset to be set for the Great Circle
     * @return
     */
    public static char decodeRunes(List<Rune> runes, Integer offset) {
        if (runes.contains(Rune.ZERO)) {
            return 32;
        }
        if (runes.contains(Rune.LESS_THAN)) {
            return 44;
        }
        if (runes.contains(Rune.GREATER_THAN)) {
            return 46;
        }
        int value = Rune.getDwarfValueSum(runes);
        char codePoint = (char) ('a' - offset - 1 + value);
        if (codePoint < 'a') {
            codePoint += 26;
        } else if (codePoint > 'z') {
            codePoint -= 26;
        }
        return codePoint;
    }
}
