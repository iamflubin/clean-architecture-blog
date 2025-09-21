package org.iamflubin.cleanarchitectureblog.security;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
@ConfigurationProperties(prefix = "app.security")
record SecurityProperties(@Valid @NotNull Cors cors) {
    record Cors(@NotEmpty List<String> allowedOrigins) {
    }
}
