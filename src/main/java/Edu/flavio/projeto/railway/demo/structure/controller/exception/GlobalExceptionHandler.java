package Edu.flavio.projeto.railway.demo.structure.controller.exception;

import org.slf4j.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger=    LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handlebusinessException(IllegalArgumentException businessException){
        return new ResponseEntity<>(businessException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handlenotFoundException(NoSuchElementException notFoundException){
        return new ResponseEntity<>("Resource ID not found.",HttpStatus.NOT_FOUND);
    }


    public ResponseEntity<String>handleUnexpectedException(Throwable unexpectedException){
            var message="Unexpected server error, see the logs.";
            logger.error(message,unexpectedException);
        return new ResponseEntity<>("Unexpected server error, see the logs.", HttpStatus.INTERNAL_SERVER_ERROR );

    }
}
