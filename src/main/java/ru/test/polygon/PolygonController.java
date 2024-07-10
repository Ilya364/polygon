package ru.test.polygon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PolygonController {
    @GetMapping("/polygon")
    public String getMap() {
        return "polygon.html";
    }

    @PostMapping("/polygon")
    public void handlePolygon(@RequestBody String coordinates) {
        System.out.println("Polygon coordinates: " + coordinates);
    }
}

