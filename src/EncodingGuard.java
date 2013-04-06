/**
 * Prevents accidental encoding conversions. If someone changes the encoding to
 * something other than UTF-8, this file won't compile.
 */
public class EncodingGuard {

    static {
        // The Euro sign has different byte representation in UTF-8, ISO-8859-15
        // and CP-1252. The encoding of this file should be UTF-8.
        switch (1) {
        case '€': break; // Euro in the encoding of this file
        case 0xA4: break; // Euro, ISO-8859-15
        case 0x80: break; // Euro, CP-1252
        //case 0x20AC: break; // Euro, UTF-8.
        }
    }
}
