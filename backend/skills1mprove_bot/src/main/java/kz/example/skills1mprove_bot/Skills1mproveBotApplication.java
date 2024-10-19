package kz.example.skills1mprove_bot;

import jakarta.annotation.PostConstruct;
import kz.example.skills1mprove_bot.service.TelegramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
/*@ComponentScan(basePackages = "kz.example.skills1mprove_bot")
@EnableJpaRepositories(basePackages = "kz.example.skills1mprove_bot.repository")*/
public class Skills1mproveBotApplication {

	@Autowired
	TelegramService telegramService;

	@PostConstruct
	public void init(){
		telegramService.sout();
	}

	public static void main(String[] args) {
		SpringApplication.run(Skills1mproveBotApplication.class, args);
	}

}
