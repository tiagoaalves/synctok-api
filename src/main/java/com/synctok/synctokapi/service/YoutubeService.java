package com.synctok.synctokapi.service;

//import com.synctok.synctokapi.client.YoutubeClient;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.RedirectView;

@Service
public class YoutubeService {

//    @Autowired
//    private YoutubeClient youtubeClient;

    @Value("${youtube.api.oauth2.base_url}")
    private String baseUrl;

    @Value("${youtube.api.oauth2.client_id}")
    private String clientId;

    @Value("${youtube.api.oauth2.redirect_uri}")
    private String redirectUri;

    @Value("${youtube.api.oauth2.response_type}")
    private String responseType;

    @Value("${youtube.api.oauth2.scope}")
    private String scope;

    @Value("${youtube.api.oauth2.access_type}")
    private String accessType;

    public RedirectView authorize() {
        RedirectView redirectView = new RedirectView();
        var authorizationUrl = baseUrl + "?client_id=" + clientId + "&redirect_uri=" + redirectUri + "&response_type=" + responseType + "&scope=" + scope + "&access_type=" + accessType;
        redirectView.setUrl(authorizationUrl);
        return redirectView;
    }
}
