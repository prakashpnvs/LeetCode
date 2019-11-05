package medium.Encode_And_Decode_TinyURL;

import java.util.HashMap;
import java.util.Map;

public class Codec {

    double value = 0.0000;
    Map<Double, String> map   = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String code = String.valueOf(value);
        String shortUrl = "http://tinyurl.com/" + code;
        map.put(value, longUrl);
        value += 0.0001;
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String[] arr = shortUrl.split("/");
        return map.get(Double.parseDouble(arr[arr.length-1]));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
