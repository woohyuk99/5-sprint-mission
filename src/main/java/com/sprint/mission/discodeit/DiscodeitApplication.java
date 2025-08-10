
package com.sprint.mission.discodeit;

import com.sprint.mission.discodeit.service.BasicService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class DiscodeitApplication implements CommandLineRunner {

	private final BasicService basicService;

	// 생성자 주입
	public DiscodeitApplication(BasicService basicService) {
		this.basicService = basicService;
	}


	public static void main(String[] args) {

		SpringApplication.run(DiscodeitApplication.class, args);

	}


	@Override
	public void run(String... args) {
		init(); // JavaApplication에서 복사
		runDemo(); // JavaApplication에서 복사
		basicService.process("Hello Spring Beans!");

	}

	void init() {
		System.out.println("초기화 로직 실행");
	}

	void runDemo() {
		System.out.println("데모 실행");
	}

}
