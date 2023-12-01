package de.chaosflaws.pitest;

public final class Main {
    public static void main(String[] args) {
        var result = new Main().someMethod();
        System.out.println(result);
    }

    public boolean someMethod() {
        return true;
    }
}
