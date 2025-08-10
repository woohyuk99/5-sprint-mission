package com.sprint.mission.discodeit.repository.file;

import com.sprint.mission.discodeit.repository.FileRepository;
import org.springframework.stereotype.Repository;


@Repository
public class FileRepositoryImpl implements FileRepository {

    @Override
    public void save(String data) {
        System.out.println("FileRepositoryImpl 저장: " + data);
    }


}
