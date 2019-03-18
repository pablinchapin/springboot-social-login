/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablinchapin.sociallogin.security.oauth2;

import com.pablinchapin.sociallogin.configuration.AppProperties;
import com.pablinchapin.sociallogin.security.TokenProvider;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

/**
 *
 * @author pvargas
 */

@Component
public class OAuth2AuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler{
    
    private TokenProvider tokenProvider;
    
    private AppProperties appProperties;
    
    private HttpCookieOAuth2AuthorizationRequestRepository httpCookieOAuth2AuthorizationRequestRepository ;
    
    
    
    
    
}
