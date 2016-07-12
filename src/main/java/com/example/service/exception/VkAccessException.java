package com.example.service.exception;

/**
 * Description: Ошибка доступа к API
 * Creation date: 12.07.2016 10:28
 *
 * @author sks
 */
public class VkAccessException extends Exception {

    public VkAccessException() {
    }

    public VkAccessException(String message) {
        super(message);
    }
}
