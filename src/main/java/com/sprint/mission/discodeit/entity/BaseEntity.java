package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public abstract class BaseEntity {
    // 직접 사용 목적으로 생성한 객체가 아닌, 상속 목적으로 쓰이는 설계도
    // -> abstrat class 선언

    protected final UUID id;
    protected final long createdAt;
    protected long updatedAt;

    public BaseEntity(UUID id, long createdAt) {
        this.id = id;
        this.createdAt = System.currentTimeMillis(); // 생성 시점의 현재 시간을 밀리초 단위로 저장
        this.updatedAt = createdAt; // 생성 시점의 시간으로 초기화
    }

    protected BaseEntity() {
    }

    public UUID getId() {
        return id;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }
}
