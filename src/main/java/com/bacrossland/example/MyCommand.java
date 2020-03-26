package com.bacrossland.example;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class MyCommand {
    @ShellMethod("Add two numbers together")
    public Integer add(int a, int b) {
        return a + b;
    }
}
