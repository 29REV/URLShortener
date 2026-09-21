package com.revanth.URLShortener.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Base62Test {

    @Test
    void testBase62EncodeAndDecode() {
        Base62 base62 = new Base62();

        long originalId = 290806L;
        String encoded = base62.encode(originalId);
        System.out.println("Encoded: " + encoded);
        long decoded = base62.decode(encoded);
        System.out.println("Decoded: " + decoded);
        assertEquals(originalId, decoded);
    }
}