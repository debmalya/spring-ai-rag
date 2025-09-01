package guru.springframework.springairag.service;

import guru.springframework.springairag.model.Answer;
import guru.springframework.springairag.model.Question;

public interface OpenAiService {


    Answer ask(Question question);
}
