package com.gdschanyang.homepage.advice;

import lombok.AllArgsConstructor;
import lombok.Getter;

/*
 * Created by ParkSuHo on 2022/03/20.
 */
@Getter
@AllArgsConstructor
public enum ErrorCode {
    /* 400 BAD_REQUEST : 잘못된 요청 */
//    INVALID_REFRESH_TOKEN("리프레시 토큰이 유효하지 않습니다"),
//    MISMATCH_REFRESH_TOKEN("리프레시 토큰의 유저 정보가 일치하지 않습니다"),
    INVALID_TOKEN("토큰이 비정상적입니다."),
    VALID_PROBLEM("Request Body 의 Valid 에 문제가 있습니다."),
    REQUEST_BODY_PROBLEM("Request Body 에 문제가 있습니다."),

    /* 401 UNAUTHORIZED : 인증되지 않은 사용자 */
//    INVALID_AUTH_TOKEN("권한 정보가 없는 토큰입니다"),
//    UNAUTHORIZED_MEMBER("현재 내 계정 정보가 존재하지 않습니다"),
    UNAUTHORIZED_MEMBER("해당 리소스에 접근할 수 없는 권한입니다."),

    /* 404 NOT_FOUND : Resource 를 찾을 수 없음, 잘못된 요청 */
    WRONG_URL("없는 URL 입니다."),
    MEMBER_NOT_FOUND("해당 멤버를 찾을 수 없습니다."),
    REFRESH_TOKEN_NOT_FOUND("리프레쉬 토큰를 찾을 수 없습니다."),
    EMAIL_TOKEN_NOT_FOUND("이메일 토큰을 찾을 수 없습니다."),

    /* 405 Method Not Allowed : 요청이 허용되지 않은 메소드 (GET,POST,PUT,DELETE,...) */
    WRONG_METHOD("잘못된 접근입니다."),

    /* 409 CONFLICT : Resource 의 현재 상태와 충돌. 보통 중복된 데이터 존재 */
    ALREADY_JOIN_MEMBER("이미 가입한 회원입니다."),
    DUPLICATE_RESOURCE("데이터가 이미 존재합니다"),
    NOT_ENABLE_MEMBER("이메일 인증을 받지 않은 회원입니다."),
    CONFLICT_REFRESH_TOKEN("리프레쉬 토큰에 문제가 있습니다."),

    /* 500 : */
    PARSE_EXCEPTION("JSON 에러가 발생했습니다."),
    SERVER_ERROR("서버에 문제가 발생했습니다.")
    ;

    private final String message;
}
