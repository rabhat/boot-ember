package com.boot.ember.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rbhat on 23/08/16.
 */
@RestController
public class SampleResource {

    @RequestMapping(value = "/api/greeting", method = RequestMethod.GET)
    public String message() {
        return new String("Welcome To Spring Boot Ember");
    }

}
