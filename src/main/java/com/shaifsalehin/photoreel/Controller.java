package com.shaifsalehin.photoreel;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@RestController
public class Controller {

    private Map<String, Photo> db = new HashMap() {{
        put("1", new Photo("1","test.jpg"));
    }};

    @GetMapping("")
    public String hello(){
        return "Welcome to PhotoReel";
    }

    @GetMapping("/photo")
    public Collection<Photo> get() {
        return db.values();
    }

    @GetMapping("/photo/{id}")
    public Photo get(@PathVariable String id) {
        Photo photo = db.get(id);
        if(photo == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return photo;
    }
}
