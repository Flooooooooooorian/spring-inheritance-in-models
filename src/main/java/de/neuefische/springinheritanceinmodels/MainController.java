package de.neuefische.springinheritanceinmodels;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/main")
public class MainController {

    @PostMapping
    public Main addMain(@RequestBody Main main) {
        System.out.println(main);
        return main;
    }
}
