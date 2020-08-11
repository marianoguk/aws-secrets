package org.coding.awssecrets.resource;

import org.coding.awssecrets.config.AwsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

@Controller
public class TestResource {

    @Autowired
    private AwsConfig config;

    @GetMapping("configs")
    public Mono<AwsConfig> getConfig() {
        return Mono.just(config);
    }
}
