package com.sprint.mission.discodeit.service;
import com.sprint.mission.discodeit.entity.User;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface Service {

    //CRUD 메서드 정의
    void create(User user);
    Optional<User> read(UUID id);
    List<User> readAll();
    void update(User user);
    void delete(UUID id);
}

