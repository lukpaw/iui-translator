package com.example.iui.translator;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TranslationService {

    private final Map<String, String> translationsEnPl;
    private final Map<String, String> translationsDePl;

    public TranslationService() {
        translationsEnPl = new HashMap<>();
        translationsEnPl.put("What are the museums?", "Jakie są muzea?");
        translationsEnPl.put("What are the theaters?", "Jakie są teatry?");
        translationsEnPl.put("What are the art galleries?", "Jakie są galerie sztuki?");
        translationsEnPl.put("What are the swimming pools?", "Jakie są baseny?");

        translationsDePl = new HashMap<>();
        translationsDePl.put("Welche Museen gibt es?", "Jakie są muzea?");
        translationsDePl.put("Welche Theater gibt es?", "Jakie są teatry?");
        translationsDePl.put("Welche Kunstgalerien gibt es?", "Jakie są galerie sztuki?");
        translationsDePl.put("Welche Schwimmbäder gibt es?", "Jakie są baseny?");
    }

    public String translate(String text, String sourceLanguage, String targetLanguage) {
        if (sourceLanguage.equals("en") && targetLanguage.equals("pl")) {
            return translationsEnPl.getOrDefault(text, "");
        } else if (sourceLanguage.equals("de") && targetLanguage.equals("pl")) {
            return translationsDePl.getOrDefault(text, "");
        } else {
            throw new UnsupportedLanguageException("Unsupported language combination: " + sourceLanguage + " -> " + targetLanguage);
        }
    }

}
