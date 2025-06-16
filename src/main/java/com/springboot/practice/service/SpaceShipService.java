package com.springboot.practice.service;

import com.springboot.practice.dto.SpaceShipDto;
import com.springboot.practice.entity.SpaceShip;
import com.springboot.practice.mapper.SpaceShipMapper;
import com.springboot.practice.repository.SpaceShipRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpaceShipService {

    private final SpaceShipRepository repository;
    private final SpaceShipMapper mapper;

    public SpaceShipService(SpaceShipRepository repository, SpaceShipMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<SpaceShipDto> findAll() {
        return repository.findAll()
                .stream()
                .map(ship -> mapper.toDto(ship))
                .collect(Collectors.toList());
    }

    public SpaceShipDto findById(Long id) {
        SpaceShip entity = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("SpaceShip not found"));

        return mapper.toDto(entity);
    }

    public SpaceShipDto update(Long id, SpaceShipDto dto) {
        SpaceShip fromDb = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("SpaceShip not found"));

        fromDb.setName(dto.getName());
        fromDb.setModel(dto.getModel());
        fromDb.setSpeed(dto.getSpeed());

        SpaceShip updated = repository.save(fromDb);
        return mapper.toDto(updated);
    }

    public SpaceShipDto save(SpaceShipDto dto) {
        SpaceShip entity = mapper.toEntity(dto);
        entity = repository.save(entity);
        return mapper.toDto(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
