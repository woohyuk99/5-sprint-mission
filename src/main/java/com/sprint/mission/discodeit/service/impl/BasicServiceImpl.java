package com.sprint.mission.discodeit.service.impl;

import com.sprint.mission.discodeit.repository.FileRepository;
import com.sprint.mission.discodeit.service.BasicService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service // Spring Bean 등록
@RequiredArgsConstructor

public class BasicServiceImpl implements BasicService {

    private final FileRepository fileRepository; // final 유지

    // 생성자 주입

    @Override
    public void process(String data) {
        fileRepository.save(data);
    }
}
