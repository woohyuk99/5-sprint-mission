package com.sprint.mission.discodeit;

import com.sprint.mission.discodeit.entity.User;
import com.sprint.mission.discodeit.service.Service;
import com.sprint.mission.discodeit.service.jcf.JCFService;
import org.w3c.dom.ls.LSResourceResolver;


import java.util.UUID;
import java.util.Optional;
import java.util.List;

public class JavaApplication {
    public static void main(String[] args) {
        // 서비스 인스턴스 생성
        Service service = new JCFService();

        System.out.println("=== 사용자 등록 ===");
        User user1 = new User();
        User user2 = new User();
        service.create(user1);
        service.create(user2);

        UUID user1Id = user1.getId("JohnDoe");
        UUID user2Id = user2.getId("JaneDoe");

        System.out.println("=== 사용자 단건 조회===");
        Optional<User> retrievedUser = service.read(user1Id);
        retrievedUser.ifPresent(user -> System.out.println("조회 사용자" + use));

        System.out.println("=== 사용자 전체 조회 ===");
        List<User> allUsers = service.readAll();
        allUsers.forEach(user -> System.out.println("사용자 ID: " + user.getUsername()));

        System.out.println("=== 사용자 정보 수정 ===");
        user1.updateUsername("JohnDoe_updated");
        service.update(user1);

        System.out.println("=== 수정된 사용자 조회 ===");
        service.read(user1Id).ifPresent(user ->
                System.out.println("수정된 이름: " + user.getUsername() + ", 수정된 시간: " + user.getUpdatedAt()));

        System.out.println("=== 사용자 삭제 ===");
        service.delete(user1Id);

        System.out.println("=== 삭제 후 사용자 전체 조회 ===");
        service.readAll().forEach(user ->
                System.out.println("남은 사용자: " + user.getUsername()));

    }
}
