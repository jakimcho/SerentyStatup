package net.jakim.testing.runners;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(SerenityJUnit5Extension.class)
@Slf4j
public class JUnit1Test {

    @Test
    @DisplayName("Single test searchForRedThings")
    public void searchForRedThings() {
        log.debug("Hello from searchForRedThings");
    }

    @Test
    @DisplayName("Single test searchForRedThings")
    public void searchForGreenThings() {
        log.debug("Hello from searchForGreenThings");
    }

}
