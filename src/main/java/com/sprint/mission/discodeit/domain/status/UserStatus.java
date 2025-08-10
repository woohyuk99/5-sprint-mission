package com.sprint.mission.discodeit.domain.status;


import lombok.Builder;
import lombok.Getter;

import java.time.Duration;
import java.time.Instant;
import java.util.UUID;

@Getter
@Builder
public class UserStatus {

    private final UUID id;
    private final UUID userId;
    private final String status;

    // 마지막 확인 접속 시간(UTC, Instant)
    @Builder.Default private final Instant lastSeenAt = Instant.now();

    @Builder.Default private final Instant createdAt = Instant.now();
    @Builder.Default private final Instant updatedAt = Instant.now();

    private static final Duration ONLINE_WINDOW = Duration.ofMinutes(5); // 상수, 5분

    // 현재 시간 기준 5분 이내면 접속 중
    public boolean isOnlineNow(){
        return lastSeenAt != null && lastSeenAt.isAfter(Instant.now().minus(ONLINE_WINDOW));
    }

    public boolean isOnlineAt(Instant now) {
        return lastSeenAt != null && lastSeenAt.isAfter(now.minus(ONLINE_WINDOW));
    }

}

