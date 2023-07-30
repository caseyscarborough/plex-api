package plex.api.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class URLEncode {

    public static String encode(String encode) {
        try {
            return URLEncoder.encode(encode, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return encode;
        }
    }
}
