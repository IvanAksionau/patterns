package com.ivan.practice.solidprinciple.depinv;

import java.io.IOException;

public class FormatException extends IOException {

    public FormatException(Exception cause) {
        super(cause);
    }
}
