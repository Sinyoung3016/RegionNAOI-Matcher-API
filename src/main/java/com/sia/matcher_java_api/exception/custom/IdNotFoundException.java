package com.sia.matcher_java_api.exception.custom;

public class IdNotFoundException extends RuntimeException {
    public IdNotFoundException() {
        super("해당 ID를 찾을 수 없습니다.");
    }
}
