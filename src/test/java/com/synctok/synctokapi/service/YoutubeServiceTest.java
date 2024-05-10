package com.synctok.synctokapi.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.servlet.view.RedirectView;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("test")
@SpringBootTest
public class YoutubeServiceTest {

    @Mock
    private RedirectView redirectView;

    @Autowired
    private YoutubeService youtubeService;

    @Test
    void testAuthorize() {

        RedirectView redirectView = youtubeService.authorize();

        String expectedUrl = "https://base.url?client_id=123456&redirect_uri=http://localhost:8080&response_type=code&scope=scope&access_type=offline";
        assertEquals(expectedUrl, redirectView.getUrl());
    }

}
