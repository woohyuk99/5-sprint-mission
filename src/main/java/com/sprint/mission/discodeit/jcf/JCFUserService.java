package com.sprint.mission.discodeit.jcf;

import com.sprint.mission.discodeit.entity.User;
import com.sprint.mission.discodeit.service.Service;

import java.util.Map;

public class JCFUserService implements Service {

    private final data;

    public JCFUserService() {
        // JCF를 사용하여 데이터를 저장할 수 있는 구조로 초기화
        this.data = new java.util.HashMap<UUID, User>();
    }

    @Override
    public void create(User user) {
        // JCF를 사용하여 사용자 생성 로직 구현
        data.put(user.getId(), user);
    }

    @Override
    public Optional<User> read(UUID id) {
        // JCF를 사용하여 사용자 조회 로직 구현
        return Optional.ofNullable(data.get(id));
    }

    @Override
    public List<User> readAll() {
        // JCF를 사용하여 모든 사용자 조회 로직 구현
        return new ArrayList<>(data.values());
    }

    @Override
    public void update(User user) {
        // JCF를 사용하여 사용자 업데이트 로직 구현
        if (data.containsKey(user.getId())) {
            data.put(user.getId(), user);
        }
    }

    @Override
    public void delete(UUID id) {
        // JCF를 사용하여 사용자 삭제 로직 구현
        data.remove(id);
    }

}
