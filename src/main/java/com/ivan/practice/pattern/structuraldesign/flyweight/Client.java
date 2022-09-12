package com.ivan.practice.pattern.structuraldesign.flyweight;

/**
 * We use flyweight design pattern if we need large number of objects of class where
 * we can easily separate out state that can be shared and state that can be externalized.
 * <p>
 * Flyweights store only "intrinsic" state or state that can be shared in any context.
 * <p>
 * Code using flyweight instance provides the extrinsic state when calling methods on flyweight.
 * Flyweight object then uses this state along with its inner state to carry out the work.
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
