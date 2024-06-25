package course.coursejavacompleted.controller;

import course.coursejavacompleted.entities.User;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u =  new User(1L,
                "Rafael",
                "rafael@gmail.com",
                "11999999999",
                "1qazzaq1");
        return ResponseEntity.ok().body(u);

    }
}
