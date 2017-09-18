package com.firstSpringCore;

public class HelloWorld {
    private String message;
    public HelloWorld() {
    }
    public String getMessage() {
        System.out.println(message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init(){
        System.out.println("Bean is intailized after property set ");
    }

    public void destroy() {
        System.out.println("Bean will destroy now.");
    }

}
