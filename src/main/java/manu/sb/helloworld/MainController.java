package manu.sb.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("api")
public class MainController {

    @GetMapping
    public Map get(@RequestParam(defaultValue = "world") String name) {
        return Collections.singletonMap("text", String.format ("Hello %s!", name));
    }

}
