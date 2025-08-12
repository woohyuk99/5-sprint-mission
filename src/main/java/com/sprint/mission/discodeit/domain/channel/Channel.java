package com.sprint.mission.discodeit.domain.channel;


import lombok.Builder;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Builder
public class Channel {
    private final UUID id;
    private final String name;
    @Builder.Default private final Instant createdAt = Instant.now();
    @Builder.Default private final Instant updatedAt = Instant.now();

}
