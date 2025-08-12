package com.sprint.mission.discodeit;

import com.sprint.mission.discodeit.service.BasicService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DiscodeitApplicationTests {

	@Autowired
	BasicService basicService;


	@Test void serviceWorks() {

		basicService.process("Test");
	}

}
