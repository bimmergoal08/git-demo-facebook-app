package com.pbhatna;

import facebook4j.Account;
import facebook4j.Facebook;
import facebook4j.FacebookFactory;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;


public class FacebookMain {
	
	// Consumer Key and Access tokens
	static String appId = "145076429172385";
	static String appSecret = "0faae4dc668e8dde169c5d178cf7d988";
	static String commaSeparetedPermissions = "email,publish_stream";
	static String accessToken = "CAACD8j0GrqEBAOZCa5jJW49E3EURmY1P2jdtsHmiy18GZC8tLXfP9TfRjgISrHhZBwANBgOJZBR6ZBhV0ozQ0E1SeR6YUoqAgX90qstSO85F5DtvLpaZABlbNAz1kSFZAL67sZCqLKnXQFWZBh2npme5ZB6CFNivWAO90pgszGJNYZBZCo6SaZBhTQ1N1UlD2VLnkTD362loqyc44CAZDZD";
	
	
	public static void main(String[] args) {
		
		try {
			Facebook facebook = new FacebookFactory().getInstance();
			facebook.setOAuthAppId(appId, appSecret);
			facebook.setOAuthAccessToken(new AccessToken(accessToken, null));
			
//			facebook.getOAuthAppAccessToken();
//			ResponseList<Account> accounts = facebook.getAccounts();
//			Account yourPageAccount = accounts.get(0);  // if index 0 is your page account.
//			String pageAccessToken = yourPageAccount.getAccessToken();
//			
			facebook.postStatusMessage("Hello World from Facebook4J.");
			
			System.out.println("Posted message successfully:");	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
