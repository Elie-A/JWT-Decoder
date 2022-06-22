/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cme.neptune.jwtdecoder.utils.jwtUtils;

import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author elie.abdallah
 */
public class JWTUtils {
    
    public String decodeJWT(String token) throws Exception{
        String payload = token.split("\\.")[1];
        return new String(Base64.decodeBase64(payload), "UTF-8");
    }
}
