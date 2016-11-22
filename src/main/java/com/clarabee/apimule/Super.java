package com.clarabee.apimule;

/**
 * Created by claraburgos on 11/21/16.
 */
public class Super {
    public void a(){

    }

    public void sayHello(){
        System.out.println("SUPER hello");
    }
}

class Sub extends Super {
    public void b(){

    }

    public void sayHello(){
        System.out.println("SUB hello");
    }
}

class SubSub extends Sub{
    public void c(){

    }
}