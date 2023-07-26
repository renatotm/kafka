package br.com.cnaga.strconsumer.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class StrConsumerListener {
	
	@KafkaListener(groupId = "group-1", topics = "str-topic", containerFactory = "strContainerFactory" )
	public void create(String message) {
		log.info("Create ::: message {}", message);
	}

	@KafkaListener(groupId = "group-1", topics = "str-topic", containerFactory = "strContainerFactory" )
	public void log(String message) {
		log.info("LOG ::: message {}", message);
	}

	@KafkaListener(groupId = "group-2", topics = "str-topic", containerFactory = "strContainerFactory" )
	public void history(String message) {
		log.info("HISTORY ::: message {}", message);
	}		
}
