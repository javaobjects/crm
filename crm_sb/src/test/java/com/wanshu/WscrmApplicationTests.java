package com.wanshu;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * JWT 演示
 */
@SpringBootTest
class WscrmApplicationTests {

    @Test
    void contextLoads() {
    }

    static String secret = "boge";

    /**
     * 生成Token信息
     *   head
     *   payload
     *   签名
     *   eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.
     *   eyJleHAiOjE2Njk4NjM3ODMsInVzZXJpZCI6MTAwMX0.
     *   bIpxjjstbiAvHs8fFjUzPOOzwxc4ugeEkQ3Fj9G7I1k
     */
    @Test
    void generatorToken(){
        Map<String,Object> map = new HashMap<>();
        map.put("alg","HS256");
        map.put("typ","JWT");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND,60*60*24);
        String token = JWT.create()
                .withHeader(map) // 设置 header
                .withClaim("userid",1001) // 设置payload
                .withExpiresAt(calendar.getTime()) // 设置过期时间 60秒
                .sign(Algorithm.HMAC256(secret)); // 设置签名 secret 秘钥 需要对外保密
        System.out.println(token);
    }

    /**
     * Token 的校验
     */
    @Test
    void verifier(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.1eyJleHAiOjE2Njk4NjQ0NDEsInVzZXJpZCI6MTAwMX0.xtbgYdRmYpekzA28OTzhSPAy0HoyupNMv4ufoyGrB_s\n";
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(secret)).build();
        DecodedJWT decodedJWT = jwtVerifier.verify(token);
        System.out.println(decodedJWT.getClaim("userid").asInt());
    }

}
