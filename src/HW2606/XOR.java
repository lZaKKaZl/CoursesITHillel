package HW2606;

/**
 * Created by teres_000 on 30.06.2015.
 */
public class XOR {
    public static byte[] encode(String pText, String pKey) {
        byte[] txt = pText.getBytes();
        byte[] key = pKey.getBytes();
        byte[] res = new byte[pText.length()];
            for (int i = 0; i < txt.length; i++) {
                res[i] = (byte) (txt[i] ^ key[i % key.length]);
            }  		return res;
    }
}
