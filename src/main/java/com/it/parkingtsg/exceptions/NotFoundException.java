package com.it.parkingtsg.exceptions;

import java.io.Serial;

public class NotFoundException extends ApplicationException{
    @Serial
    private static final long serialVersionUID = -2249736283502631807L;

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(Throwable cause) {
        super(cause);
    }
}

