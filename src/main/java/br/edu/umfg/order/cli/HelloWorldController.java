package br.edu.umfg.order.cli;

import org.springframework.shell.command.annotation.Command;

@Command(group = "Hello World")
public class HelloWorldController {

    @Command(command = "hello-world")
    public void helloWorld() {
        System.out.println("Hello World!");
    }

}
