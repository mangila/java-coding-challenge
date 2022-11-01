package com.kattis.sacredtexts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RuneDecoderTest {

    RuneDecoder decoder = RuneDecoder.getDecoder();

    @Test
    void testHelloWorld() {
        var result = decoder.decode("* h", "* ' . . .# 0 '%- #. /% . & >");
        assertEquals("hello world.", result);
    }

    @Test
    void testRickRoll() {
        var header = "/! n";
        var runes = ".\" ' !.) ' .& 0 ) \"/ +% /! # 0 ) + +- ' 0 ! ,% \"'. 0 #.& *( >\n" +
                "$, ' -+ ' &. 0 ) &+ &* !/ # 0 . ' $+' 0 ! !)' +, 0 & \"/ '#/ !/ >\n" +
                "/! ' .* ' .& 0 ) +& %+ &* # 0 $.\" .) (( 0 # ,( %, #\"'+ *& & <\n" +
                "# /! & 0 & ' #+' ' %/ *, 0 ! .# ',$ >\n" +
                ",$ ' %/$ ' !.% 0 ) +& )' *& # 0 / # - ' 0 ! ,% -* 0 % '- ! <\n" +
                "\". ' ($, ' .& 0 ) %, *& %+ # 0 %.\" # ! 0 ) *' () & $ ! ' >\n" +
                "&* ' /) ' &. 0 ) \"/ /! $, # 0 $!,% ' . . 0 # 0 . + ' <\n" +
                "# *& & 0 * &!+% )+ ++ 0 ! .# '$, >";
        var result = decoder.decode(header, runes);
        assertEquals("never gonna give you up.never gonna let you down.never gonna run around,and desert you.never gonna make you cry,never gonna say goodbye.never gonna tell a lie,and hurt you.", result);
    }
}