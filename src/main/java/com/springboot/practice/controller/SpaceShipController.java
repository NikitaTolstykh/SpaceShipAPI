package com.springboot.practice.controller;

import com.springboot.practice.dto.SpaceShipDto;
import com.springboot.practice.service.SpaceShipService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/spaceships")
public class SpaceShipController {

    private final SpaceShipService service;

    public SpaceShipController(SpaceShipService service) {
        this.service = service;
    }

    @GetMapping
    public List<SpaceShipDto> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public SpaceShipDto getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public SpaceShipDto create(@RequestBody SpaceShipDto dto) {
        return service.save(dto);
    }

    @PutMapping("/{id}")
    public SpaceShipDto update(@PathVariable Long id, @RequestBody SpaceShipDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
