package com.midnightsun.revrateservice.web.exception;

import com.midnightsun.revrateservice.web.exception.enums.ErrorCode;

public class HttpServerErrorException extends DebuggableException{
    public HttpServerErrorException(String debugMessage) {
        super(ErrorCode.SERVER_ERROR, debugMessage);
    }

    public HttpServerErrorException(String debugMessage, Throwable throwable) {
        super(ErrorCode.SERVER_ERROR, debugMessage, throwable);
    }
}
