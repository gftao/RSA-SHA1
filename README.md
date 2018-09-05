# RSA-SHA1


1. 私钥签名过程    
	> String signstr = RSASignature.sign(content, PriKey);
2. 公钥校验签名
	>boolean ok = RSASignature.doCheck(content, signstr, PubKey);

3. 公钥加密私钥解密过程
4. 私钥加密公钥解密过程
