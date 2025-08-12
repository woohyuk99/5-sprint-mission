package com.sprint.mission.discodeit.domain.content;


import lombok.Builder;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Builder
public class BinaryContent {

    private final UUID id;
    private final String contentType;
    private final long size;
    private final byte[] data; // 파일 저장 방식에 맞게 변경
    @Builder.Default private final Instant createdAt = Instant.now();

}
