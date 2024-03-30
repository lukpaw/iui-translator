package com.example.iui.translator;

public class UnsupportedLanguageException extends RuntimeException {

    public UnsupportedLanguageException() {
        super();
    }

    public UnsupportedLanguageException(String message) {
        super(message);
    }

    public UnsupportedLanguageException(String message, Throwable cause) {
        super(message, cause);
    }
}
