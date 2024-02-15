package de.aittr.g_31_2_mapstruct.controllers;

import de.aittr.g_31_2_mapstruct.domain.UserDto;
import de.aittr.g_31_2_mapstruct.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Tag(
        name = "Контроллер пользователей",
        description = "Контроллер для осуществления различных операций над объектами пользователей"
)
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    @Operation(
            summary = "Получение всех пользователей",
            description = "Получение списка всех объектов пользователей, хранящихся в базе данных"
    )
    public List<UserDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    @Operation(
            summary = "Получение конкретного пользователя",
            description = "Получение пользователя, соответствующего переданному идентификатору"
    )
    public UserDto getById(
            @PathVariable
            @Parameter(description = "Идентификатор пользователя")
            int id
    ) {
        return service.getById(id);
    }

    @PostMapping
    @Operation(
            summary = "Сохранение пользователя",
            description = "Сохранение в базу данных нового пользователя, переданного в теле запроса"
    )
    public UserDto save(
            @RequestBody
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Объект пользователя")
            UserDto dto) {
        return service.save(dto);
    }

    @DeleteMapping("/{id}")
    @Operation(
            summary = "Удаление пользователя",
            description = "Удаление пользователя, соответствующего переданному идентификатору"
    )
    public void deleteById(
            @PathVariable
            @Parameter(description = "Идентификатор пользователя")
            int id) {
        service.deleteById(id);
    }
}