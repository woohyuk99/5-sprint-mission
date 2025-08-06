package com.sprint.mission.discodeit.entity;

public class Message extends BaseEntity{

    private String content;
    private UUID userId;
    private UUID channelId;

    public Message(Strinc content, UUID userId, UUID channelId) {
        super(UUID.randomUUID(), System.currentTimeMillis());
        this.content = content;
        this.userId = userId;
        this.channelId = channelId;
    }

    public String getContent() {
        return content;
    }

    public UUID getUserId() {
        return userId;
    }

    public UUID getChannelId() {
        return channelId;
    }

    public void updateContent(String content) {
        this.content = content;
        updateTimeStamp(); // 업데이트 시점의 현재 시간을 밀리초 단위로 저장
    }
}
