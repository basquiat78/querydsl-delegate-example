package io.basquiat.querydsl.global.model.response

/**
 * 에러 공통 응답 객체
 * created by basquiat
 */
data class ApiErrorResponse(
    val code: Int,
    val message: String,
)