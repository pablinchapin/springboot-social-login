/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablinchapin.sociallogin.configuration;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author pvargas
 */

@ConfigurationProperties(prefix = "app")
public class AppProperties {
    
    private final Auth auth = new Auth();
    private final OAuth2 oauth2 = new OAuth2();
    
    public static class Auth{
        private String tokenSecret;
        private long tokenExpirationMS;

        public String getTokeSecret() {
            return tokenSecret;
        }

        public void setTokeSecret(String tokenSecret) {
            this.tokenSecret = tokenSecret;
        }

        public long getTokenExpirationMS() {
            return tokenExpirationMS;
        }

        public void setTokenExpirationMS(long tokenExpirationMS) {
            this.tokenExpirationMS = tokenExpirationMS;
        }
        
        
    
    }
    
    public static class OAuth2 {
        
        private List<String> authorizedRedirectUris = new ArrayList<>();

        public List<String> getAuthorizedRedirectUris() {
            return authorizedRedirectUris;
        }

        public OAuth2 authorizedRedirectUris(List<String> authorizedRedirectUris) {
            this.authorizedRedirectUris = authorizedRedirectUris;
            return this;
        }

    }

    public Auth getAuth() {
        return auth;
    }

    public OAuth2 getOauth2() {
        return oauth2;
    }

    
    
    
    
}
