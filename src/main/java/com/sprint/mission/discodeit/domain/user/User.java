package com.sprint.mission.discodeit.domain.user;

import lombok.Builder;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Builder

public class User {
    private final UUID id;
    private final UUID profiledId;

    private final UUID profileId; // null 일 경우 기본 이미지로 간주
    @Builder.Default private final Instant createdAt = Instant.now();
    @Builder.Default private final Instant updatedAt = Instant.now();

}
