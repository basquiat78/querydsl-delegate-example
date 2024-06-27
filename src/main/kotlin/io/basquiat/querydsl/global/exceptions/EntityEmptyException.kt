package io.basquiat.querydsl.global.exceptions

/**
 * EntityEmptyException
 * 조회시 entity 정보가 null일때 사용한다.
 * created by basquiat
 */
class EntityEmptyException(message: String? = "entity가 존재하지 않습니다.") : RuntimeException(message)