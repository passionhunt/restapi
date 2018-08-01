package com.passionhunt.ai.restapi.resources;

import com.passionhunt.ai.restapi.resources.model.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by i316579 on 31/07/18.
 */

@RestController
@RequestMapping("/rest/user")
public class UserResource {

    @GetMapping
    @ApiOperation(value = "Get user")
    public List<User> getUsers(){

        return Arrays.asList(
                new User("komal", 2000L),
                 new User("komal", 2000L)

        );
    }

    @GetMapping("/{userName}")
    @ApiOperation(value = "Get user for username")
    public User getUser(@PathVariable("userName") final String userName){
        return new User(userName, 2000L );
    }

}
