package com.example.ws.Security;

import java.security.Key;

import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

public class SecurityConstants {
	public static final long EXPIRATION_TIME=864000000;
	public static final String TOKEN_PREFIX="Bearer ";
	public static final String HEADER_STRING="Authorization";
	public static final String SIGN_UP_URL="/users";
	//public static final String TOKEN_SECRET="dfg893hdc475zwerop41ghg4dfeqaaz?=-01jznm0-9";
	
	public static final byte[] keyBytes = Decoders.BASE64.decode("dfg893hdc475zwerop41ghg4dfeqaaz?=-01jznm0-9");
	public static final  Key TOKEN_SECRET = Keys.hmacShaKeyFor(keyBytes);
	
	

}
