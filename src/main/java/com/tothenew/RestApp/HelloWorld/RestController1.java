// Q1 Create a simple REST ful service in Spring Boot which
// returns the Response "Welcome to spring boot"

package com.tothenew.RestApp.HelloWorld;

import com.tothenew.RestApp.HelloWorld.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController1
{
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
}
