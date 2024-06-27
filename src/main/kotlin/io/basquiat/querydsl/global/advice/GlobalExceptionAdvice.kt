package io.basquiat.querydsl.global.advice

import io.basquiat.querydsl.global.exceptions.EntityEmptyException
import io.basquiat.querydsl.global.model.response.ApiErrorResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

/**
 * rest api error advice
 * created by basquiat
 */
@RestControllerAdvice
class GlobalExceptionAdvice {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(EntityEmptyException::class)
    fun handleNotFoundException(ex: EntityEmptyException) = ApiErrorResponse(
            code = HttpStatus.NOT_FOUND.value(),
            message = ex.message!!,
    )

}