package com.sprint.mission.discodeit.domain.message;

import lombok.Builder;
import lombok.Getter;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Getter
@Builder
public class Message {

    private final UUID id;
    private final UUID channelId;
    private final UUID authorId;
    private final String content;

    @Builder.Default private final List<UUID> attachmentIds = List.of();

    @Builder.Default private final Instant createdAt = Instant.now();
    @Builder.Default private final Instant updatedAt = Instant.now();

    public boolean hasAttachments() {
        return attachmentIds != null && !attachmentIds.isEmpty();
    }

}
