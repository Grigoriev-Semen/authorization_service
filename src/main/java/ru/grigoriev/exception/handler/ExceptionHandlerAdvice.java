package ru.grigoriev.exception.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.grigoriev.exception.InvalidCredentials;
import ru.grigoriev.exception.UnauthorizedUser;

@Slf4j
@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler
    public ResponseEntity<String> icHandler(InvalidCredentials e) {
        return new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<String> uuHandler(UnauthorizedUser e) {
        log.warn(e.toString());
        return new ResponseEntity<>(e.toString(), HttpStatus.UNAUTHORIZED);
    }
}
