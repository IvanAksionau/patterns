package com.ivan.practice.pattern.behaviouraldesign.command;

/**
 * We want to represent a request or a method call as an object.
 * Information about parameters passed and the actual operation is encapsulated in an object called command.
 * <p>
 * Advantage of command pattern is that, what would have been a method call is now an object
 * which can be stored for later execution or sent to other parts of code.
 * <p>
 * We can now even queue our command objects and execute them later.
 * An example of "Command" pattern is java.lang.Runnable class
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        EWSService service = new EWSService();

        System.out.println(Thread.currentThread().getId());
        Command c1 = new AddMemberCommand("a@a.com", "spam", service);
        MailTasksRunner.getInstance().addCommand(c1);

        Command c2 = new AddMemberCommand("b@b", "spam", service);
        MailTasksRunner.getInstance().addCommand(c2);

        Thread.sleep(3000);// here we give a time for MailTasksRunner run() to finish commands
        MailTasksRunner.getInstance().shutdown();
    }
}
