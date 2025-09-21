package org.iamflubin.cleanarchitectureblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class SpaController {
    @GetMapping("{path:^(?!api|public|swagger)[^\\.]*}/**")
    public String redirect() {
        return "forward:/";
    }
}
