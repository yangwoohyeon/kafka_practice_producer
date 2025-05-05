package kafka_practice.demo.domain.controller;

import kafka_practice.demo.domain.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaProducerController {

    private final KafkaProducerService kafkaProducerService;

    @PostMapping("/api/comment")
    public ResponseEntity<Void> sendMessage(@RequestParam String message) {
        kafkaProducerService.sendMessageToKafka(message);
        return ResponseEntity.ok().build();
    }
}
