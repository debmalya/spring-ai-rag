package guru.springframework.springairag.controller;

import guru.springframework.springairag.model.Answer;
import guru.springframework.springairag.model.Question;
import guru.springframework.springairag.service.OpenAiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1")
@RequiredArgsConstructor
public class RAGController {
    private final OpenAiService openAiService;
    @PostMapping("/ask")
    public Answer askQuestion(@RequestBody Question question) {
        return openAiService.ask(question);
    }
}
