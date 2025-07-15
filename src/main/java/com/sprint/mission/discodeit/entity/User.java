package com.sprint.mission.discodeit.entity;
import java.util.UUID;

public class User extends BaseEntity {

    String username;

    public User(String username){
        super(UUID.randomUUID(), System.currentTimeMillis());
        this.username = username;
    }

    public String getUsername() {
        // getter은 읽기 전용
        return username;
    }

    public void updateUsername(String username) {
        this.username = username;
        updateTimestamp(); // 업데이트 시점의 현재 시간을 밀리초 단위로 저장
    }
    // setUsername 대신 updateUsername 사용
    // 의미 있는 동작으로 명확하게 표현


}
