package io.basquiat.querydsl.global.utils

import io.basquiat.querydsl.global.exceptions.EntityEmptyException

/**
 * 메세지가 없는 경우
 */
fun entityEmpty(): Nothing {
    throw EntityEmptyException()
}

/**
 * 메세지가 있는 경우
 * @param message
 */
fun entityEmpty(message: String?): Nothing {
    if(message == null) {
        entityEmpty()
    } else {
        throw EntityEmptyException(message)
    }
}