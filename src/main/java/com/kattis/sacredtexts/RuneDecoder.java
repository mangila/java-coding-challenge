package com.kattis.sacredtexts;

/**
 * https://open.kattis.com/problems/sacredtexts
 */
public class RuneDecoder {

    private RuneDecoder() {
        // don't invoke me
    }

    public static RuneDecoder getDecoder() {
        return new RuneDecoder();
    }

    /**
     * @param header - header format: e.g. * h
     * @param runes - runes format: e.g. * ' . . .# 0 '%- #. /% . & >
     * @return
     */
    public String decode(String header, String runes) {
        var splitHeader = header.split("\\s");
        var splitRunes = runes.split("\\s");
        var headerRunes = splitHeader[0].chars()
                .boxed()
                .map(Rune::fromAsciiValue)
                .toList();
        var letter = splitHeader[1].charAt(0);
        var offset = RuneDecoderUtils.getOffset(headerRunes, letter);
        var translation = new StringBuilder();
        for (var r : splitRunes) {
            var tokens = r.chars()
                    .boxed()
                    .map(Rune::fromAsciiValue)
                    .toList();
            var decodedRune = RuneDecoderUtils.decodeRunes(tokens, offset);
            translation.append(decodedRune);
        }
        return translation.toString();
    }
}
