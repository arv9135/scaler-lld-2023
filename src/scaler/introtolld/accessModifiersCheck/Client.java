package scaler.introtolld.accessModifiersCheck;

import scaler.introtolld.accessmodifiers.Student;

public class Client extends Student {

    public void doSomething() {
        this.psp = 10.01;
//        this.name = "Sharma"; ERROR: name is private
//        this.batchId = 2;  ERROR: batchId has a default scope i.e not be accessible outside the package
        this.universityName = "world";
    }
}
