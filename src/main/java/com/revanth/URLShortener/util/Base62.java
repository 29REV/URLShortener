package com.revanth.URLShortener.util;

public class Base62 {
    private static final String st= "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int BASE = 62;
    public String encode(Long value){
        StringBuilder encoded = new StringBuilder();
        if (value == 0) {
            return String.valueOf(st.charAt(0));
        }
        while (value > 0) {
            int remainder = (int)(value % BASE);
            encoded.append(st.charAt(remainder));
            value /= BASE;
        }
        return encoded.reverse().toString();
    }
    public Long decode(String encoded){
        Long decoded =0L;
        for(int i=0;i<encoded.length();i++){
            decoded = decoded * BASE + st.indexOf(encoded.charAt(i));
        }
        return decoded;
    }
}
