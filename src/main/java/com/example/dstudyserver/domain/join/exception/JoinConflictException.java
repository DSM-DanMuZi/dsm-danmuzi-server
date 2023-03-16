package com.example.dstudyserver.domain.join.exception;

import com.example.dstudyserver.global.error.ErrorCode;
import com.example.dstudyserver.global.error.exception.CustomException;

public class JoinConflictException extends CustomException {
    public  JoinConflictException(){
        super(ErrorCode.JOIN_CONFLICT);
    }
}
