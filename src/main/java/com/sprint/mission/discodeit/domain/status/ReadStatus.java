package com.sprint.mission.discodeit.domain.status;


import lombok.Builder;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Builder
public class ReadStatus {
    private final UUID id;
    private final UUID userId;
    private final UUID channelId;
    @Builder.Default private final Instant lastReadAt = Instant.now();
}
