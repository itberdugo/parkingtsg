package com.it.parkingtsg.exceptions;

import java.io.Serial;
import java.io.Serializable;

public class ApplicationException extends Exception implements Serializable {
    @Serial
    private static final long serialVersionUID = 8688318360275333394L;

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(Throwable cause) {
        super(cause);
    }
}