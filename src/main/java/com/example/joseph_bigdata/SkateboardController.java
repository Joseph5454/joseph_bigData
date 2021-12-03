package com.example.joseph_bigdata;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class SkateboardController {
    public SkateboardController(SkateboardRepository skateboardRepository) {
        this.skateboardRepository = skateboardRepository;
    }

    private SkateboardRepository skateboardRepository;

    @GetMapping("skates")
    public List<Skateboard> getSkates() {
        return skateboardRepository.findAll();
    }

    @PostMapping("skate")
    public void postSkate(@RequestBody Skateboard skateboard) {
        skateboardRepository.insert(skateboard);
    }
}
