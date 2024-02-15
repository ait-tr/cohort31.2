package de.aittr.g_31_2_mapstruct.services;

import de.aittr.g_31_2_mapstruct.domain.User;
import de.aittr.g_31_2_mapstruct.domain.UserDto;
import de.aittr.g_31_2_mapstruct.repositories.UserRepository;
import de.aittr.g_31_2_mapstruct.services.mapping.UserMappingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository repository;
    private UserMappingService mappingService;

    public UserService(UserRepository repository, UserMappingService mappingService) {
        this.repository = repository;
        this.mappingService = mappingService;
    }

    public List<UserDto> getAll() {
        return repository.findAll()
                .stream()
                .map(u -> mappingService.mapEntityToDto(u))
                .toList();
    }

    public UserDto getById(int id) {
        User user = repository.findById(id).orElse(null);
        return user == null ? null : mappingService.mapEntityToDto(user);
    }

    public UserDto save(UserDto dto) {
//        String password = dto.getPassword();
//        String hashedPassword = String.valueOf(password.hashCode());
//        dto.setPassword(hashedPassword);
        User entity = mappingService.mapDtoToEntity(dto);
        entity = repository.save(entity);
        return mappingService.mapEntityToDto(entity);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }
}