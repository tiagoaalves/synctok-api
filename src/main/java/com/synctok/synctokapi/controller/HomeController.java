package com.synctok.synctokapi.controller;

import com.synctok.synctokapi.service.YoutubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @Autowired
    private YoutubeService youtubeService;

    @GetMapping("")
    public RedirectView authorize() {
        return youtubeService.authorize();
    }
}
