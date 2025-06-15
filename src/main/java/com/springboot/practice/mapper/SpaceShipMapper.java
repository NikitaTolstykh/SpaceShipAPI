package com.springboot.practice.mapper;

import com.springboot.practice.dto.SpaceShipDto;
import com.springboot.practice.entity.SpaceShip;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SpaceShipMapper {
   SpaceShipDto toDto(SpaceShip entity);
   SpaceShip toEntity(SpaceShipDto dto);

}
