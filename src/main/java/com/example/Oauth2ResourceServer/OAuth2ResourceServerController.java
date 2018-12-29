package com.example.Oauth2ResourceServer;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class OAuth2ResourceServerController {

    @GetMapping("/")
    public String index(@AuthenticationPrincipal Principal principal) {
        return String.format("Hello, %s!", principal.getName());
    }
}
