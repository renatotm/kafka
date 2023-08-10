package br.com.cnaga.strconsumer.listeners;

import org.springframework.stereotype.Component;

import br.com.cnaga.strconsumer.custom.StrConsumerCustomListener;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class StrConsumerListener {
	
	@SneakyThrows
	@StrConsumerCustomListener(groupId = "group-1")
	public void create(String message) {
		log.info("CREATE ::: message {}", message);
		throw new IllegalArgumentException("Exception...");
	}

	@StrConsumerCustomListener(groupId = "group-1")
	public void log(String message) {
		log.info("LOG ::: message {}", message);
	}

	@StrConsumerCustomListener(groupId = "group-2")
	public void history(String message) {
		log.info("HISTORY ::: message {}", message);
	}		
}
