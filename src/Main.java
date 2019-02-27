import RSASIG.*;

public class Main {
    public static void main(String[] args) {
        /*
        String PriKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDy++sEwc1Zz1n2" +
                "PPgdgSaUNUIUn1dLY1l+oehWuBWwOm+QX5cYsrj62/2t0iRPdIrhvi8U5fvfTJRA" +
                "AfhXH6NiIx9xkAOx3g9mE6PfPNKH0eUu6SuVi2rOeCSaM/PWpWPbp84+PdQct9yR" +
                "mTM34SJggd6xYJCdy4E+6oqlL5QeegHVffv9I1fSkDGIQzV8+6c+Ybdz300TsCkj" +
                "TqPzoHIc2h7tgn+JeZw60xes7cZjjeNnH6X6Htl9dIvUSGvTU9kHQNck1dKMhUt4" +
                "glWcu0zYScwPeqYE99KH//wm0KgiAwlPu4mr4Wt1wF4hDdiFIJFSGzHOOVgTwtls" +
                "qvdFUMU7AgMBAAECggEAFRXFPCFxJ2T14odB5JWLenrwpAd7tMAHSRTVq4jH4QYB" +
                "Hl8dJniD0sj6R3YfzoFHd/Vf8olOhP8JMlC5cx38uIxhsyITIAEsBuiXZMzLXBvb" +
                "rmlvbceuWgJU8silVS/+7VWvcPk+ictuqXfI2QWBTSyX3X6Krha1vXbu1wy85rP2" +
                "X+qZPL3RxYCO7PXkbJqsznArTQc3y4a798s6eE2PaJHe0wezMHaSzlcdAjj4yYYK" +
                "QZs6NtRNOgptXUH9sJpL3L+FAhX2UIokuT5sqFy3ssDFZ0UkKSKYEA0XWK/DLcJ0" +
                "r4stlPJv/8L4pZipXdHWq73tQr9VWHTkHT+au1bUGQKBgQD961YVsXFC211c32GY" +
                "HFOPHrY5bINxWAwGxg9VGNJjJ6bfQDofnS0BCP2874Ax8C6v/j1VQG2vR+zwu7Nq" +
                "FKK9DzZM6N3/on1NF1trCEqKSw1HRvbDgJ+T30dfnFEt4YilWLpMAEPbI9wrwkOY" +
                "jnEs1w/XVPspSFjZcp5/GXuVFwKBgQD0+aRnbaJkwzyI4E2LFEMEZu39ui4Kg9gD" +
                "o+lz4MphVE3hPXEl+0FAFppegY8dlsLrOL3FclH0q8EpZwbxJxUFgSO23KCzsjyx" +
                "vyL1njyhQ7SzmNHgWAQaWRUweFofBzDFYJIu8eIIrk70LdhL023fqRFXHLXfk+Zl" +
                "QQzJEMxvfQKBgQD7ITL9t4YuOmkHPoL2fyWBSj2tY45Inm0ekep+HlON75yR9qLF" +
                "u5zUBkF2CGWAfmyecVPVqigREJDdsraKdyhQ1ee9fx55AwrsIOqwW/3k8r+KPDw4" +
                "NVEeXdjoTeDYANQ1vCBcpHJ4HOpXeQWDr3VthLJNJOZW+Q+u2Da7u8dHNwKBgB5P" +
                "qUz23soS8jGJd27HAgfQaJAlcj7w01CX/nHNFZ13Xe+Jt69YaFlysoURCNFDbzjF" +
                "m42LuKJKgisKSWybRlmZAf9FS0kQu7vOh5fWjW/yvbAfL5DPsypDbYDC03vVWu6B" +
                "JXVTjoE+eBx0c7fmIEk1VSTvM33HghFzPA7A2lrNAoGAYTezvocm3iyIvRyHPYKN" +
                "dLlvVFedictRf+DHn+L0mu5s2uvbHYQWlA/Ls6YCeQXN4GBG0yZmX1V699lv1mEL" +
                "gSCOf1DJl/kRYaBxN7pgb4eIo/A4iPkZyNPrOW+LUFGglpBDim2y73WIl8AKBYXW" +
                "DvnG6yzCimfAHD80tCISJNQ=";
        String PubKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqKpM2rTY0EhdRkLWw6bQ\n" +
                "m4XDhgrevjvyfEB0SC7gOxoaSfw9I2Bcxi5GZOFQlkiBA4wy4a4uXpZccbbu92A4\n" +
                "r2xA8sY35SpZAFxuxwKWVodhunoCw02Eaof2AEDIltWk6ahNCssy4rqiePRB6EU7\n" +
                "YzqvO1gV19o4oYGAQxQR7pd9BhdqZF/inpeNP0ddsRBnXlWyC5J8XLJ2hdT3G2WE\n" +
                "fF7aOWgRsbdfdD7HRAfTCIX1kR++LylcgtdGylCN8MRhJuFqG6m8N5N/lNt3tanD\n" +
                "ZXCqIrrojBS7aDANERmUI6uhkqgkUGjXcxzkM3a9uz+lpW6dmzq0HAnwoorHtTWt\n" +
                "oQIDAQAB";


        String content = "1234567890";
        System.out.println("---------------私钥签名过程------------------");
        String signstr = RSASignature.sign(content, PriKey);
        System.out.println("签名原串：" + content);
        System.out.println("签名串：" + signstr);
        System.out.println("---------------公钥校验签名------------------");
        signstr = "mLD5xZcz5+OKCMtaN8Z1RJAn73MPJyLAFrxUI7ToRrB+INKFxGSbqvFnKKCuJCsTodEa5f5x2BZ4UI4yxNqveZKML/gEOKJyk0DDzFPGOxwipbYQQhjWzx3XLFecpB8mcuTrEVWnkQeDZfL668rwcsVNX/KORFlbhfUpKsw+zg0Vjls8rnEUeavi7h3x4toue7mPAkMHrexKnkyaccSA3bxOC3+83HfvysDHFK4xBFLFuz22AiR+tT/gUtTNYwtg0RhiVP1wIhq3LhFL7jRJIVObUGJROX91n4MF3YNQzJMrVKRplEceBc7WDjj9k0ss+Ue6/bFsdI/bhXBQwgZW2Q==";
        content = "{\"ins_id_cd\":\"10002887\",\"chn_ins_id_cd\":\"10002887\",\"prod_cd\":\"1151\",\"biz_cd\":\"0000007\",\"mcht_cd\":\"996180919290861\",\"tran_dt_tm\":\"20180921130928\",\"order_id\":\"2018123456789111\",\"tran_amt\":\"1\",\"qr_code_info\":{\"noti_url\":\"http:\\/\\/192.168.30.10:8088\\/prodpmpnotify\",\"sub_user_id\":\"071RvxRB06w5qf2Lp5TB0VzlRB0RvxR0\",\"sub_app_id\":\"wxf706feff0ab830c4\"},\"tran_cd\":\"1191\"}";
        boolean ok = RSASignature.doCheck(content, signstr, PubKey);
        System.out.println("验签结果：" + ok);

        System.out.println("--------------公钥加密私钥解密过程-------------------");
        String plainText = "ihep_公钥加密私钥解密";
        //公钥加密过程
        try {
            byte[] cipherData = RSAEncrypt.encrypt(RSAEncrypt.loadPublicKeyByStr(PubKey), plainText.getBytes());
            String cipher = Base64.encode(cipherData);
            //私钥解密过程
            byte[] res = RSAEncrypt.decrypt(RSAEncrypt.loadPrivateKeyByStr(PriKey), Base64.decode(cipher));
            String restr = new String(res);
            System.out.println("原文：" + plainText);
            System.out.println("加密：" + cipher);
            System.out.println("解密：" + restr);
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }


        System.out.println("--------------私钥加密公钥解密过程-------------------");
        plainText = "ihep_私钥加密公钥解密";
        try {
            byte[] cipherData = RSAEncrypt.encrypt(RSAEncrypt.loadPrivateKeyByStr(PriKey), plainText.getBytes());
            String cipher = Base64.encode(cipherData);
            //公钥解密过程
            byte[] res = RSAEncrypt.decrypt(RSAEncrypt.loadPublicKeyByStr(PubKey), Base64.decode(cipher));
            String restr = new String(res);
            System.out.println("原文：" + plainText);
            System.out.println("加密：" + cipher);
            System.out.println("解密：" + restr);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        //私钥加密过程

        System.out.println();

        */

        System.out.println("--------------MD5+BASE64-------------------");
        try {
            String password2 = "827358268";
            String cipher = EncodeUtil.md5EncryptBase64(password2);
            System.out.println(cipher);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
