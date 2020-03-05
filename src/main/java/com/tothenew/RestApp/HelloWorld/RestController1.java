// Q1 Create a simple REST ful service in Spring Boot which
// returns the Response "Welcome to spring boot"

package com.tothenew.RestApp.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class RestController1
{
    @Autowired
    private MessageSource messageSource;
    @GetMapping("/helloworld")
    String show()

    {
        return "Hello World";
    }
    @GetMapping("/hello-world-bean")
    HelloWorldBean showBean()

    {
        return (new HelloWorldBean("Hi Shivam"));
    }


    @GetMapping("helloworldbean/path-variable/{name}")
    HelloWorldBean showpathVariable(@PathVariable String name)
    {
        return (new HelloWorldBean(String.format("Welcome to spring Boot  , %s",name)));
    }

    @GetMapping("helloworld/internationalization")
    public String helloWorldInternationalization(@RequestHeader(name="Accept-Language",required = false) String locale)
    {
            return (messageSource.getMessage("good.morning.message",null,new Locale(locale)));
    }
}
