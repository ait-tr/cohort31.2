package de.aittr.g_31_2_mapstruct.services.mapping;

import de.aittr.g_31_2_mapstruct.domain.User;
import de.aittr.g_31_2_mapstruct.domain.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMappingService {

    // 1. Мы позволяем клиенту перезаписать старые данные в БД. - SOLVED
    // 2. Разное название полей в энтити и дто - SOLVED
    // 3. Мы отдаём клиенту пароли - SOLVED
    // 4. Пароли вообще не шифруются, сохраняются в БД в сыром виде - SOLVED

    @Mapping(source = "entity.name", target = "username") // PROBLEM 2
    @Mapping(target = "password", constant = "password is hidden") // PROBLEM 3
    UserDto mapEntityToDto(User entity);

    @Mapping(source = "dto.username", target = "name") // PROBLEM 2
    @Mapping(target = "id", constant = "0") // PROBLEM 1
    @Mapping(target = "password", expression = "java(String.valueOf(dto.getPassword().hashCode()))") // PROBLEM 4
    User mapDtoToEntity(UserDto dto);
}