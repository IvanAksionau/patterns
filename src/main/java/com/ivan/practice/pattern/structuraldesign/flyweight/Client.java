package com.ivan.practice.pattern.structuraldesign.flyweight;

/**
 * java.lang.Integer is an example of flyweight pattern
 */
public class Client {

    public static void main(String[] args) {

        SystemErrorMessage msg1 = ErrorMessageFactory.getInstance()
                .getError(ErrorMessageFactory.ErrorType.GenericSystemError);
        System.out.println(msg1.getText("4056"));

        UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedMessage("1202");
        System.out.println(msg2.getText(null));
    }
}
