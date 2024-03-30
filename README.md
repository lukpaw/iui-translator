## Inteligentna Usługa Informacyjna - Tłumacz

Ten Spring Boot odpowiada za tłumaczenie pytań z języków obcych na język polski.

### API

**Endpoint:** `/api/transcriptor/translate`

**Metoda:** POST

**Przykładowy JSON wejściowy:**

```json
{
  "text": "What are the museums?",
  "sourceLanguage": "en",
  "targetLanguage": "pl"
}
```

**Przykładowy JSON wyjściowy:**

```json
{
  "translatedText": "Jakie są muzea?"
}
```

**Obsługiwane języki:**

* Angielski (en)
* Niemiecki (de)

### Przykład użycia

1. Uruchom aplikację Spring Boot.
2. Wyślij żądanie POST do endpointu `/api/transcriptor/translate` z JSONem wejściowym.
3. Aplikacja zwróci JSON z przetłumaczonym tekstem.