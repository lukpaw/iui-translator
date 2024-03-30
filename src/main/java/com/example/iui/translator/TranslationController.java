package com.example.iui.translator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/translator")
public class TranslationController {

    private final TranslationService translationService;

    public TranslationController(TranslationService translationService) {
        this.translationService = translationService;
    }

    @PostMapping("/translate")
    public TranslationResponse translate(@RequestBody TranslationRequest request) {
        String translatedText = translationService.translate(request.getText(), request.getSourceLanguage(), request.getTargetLanguage());
        return new TranslationResponse(translatedText);
    }

}

