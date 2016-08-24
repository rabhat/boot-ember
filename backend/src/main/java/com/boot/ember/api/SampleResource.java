package com.boot.ember.api;

import com.boot.ember.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rbhat on 23/08/16.
 */
@RestController
public class SampleResource {

    @RequestMapping(value = "/api/greeting", method = RequestMethod.GET)
    public Greeting message() {
        return new Greeting(1,"Welcome To Spring Boot Ember");
    }

}
