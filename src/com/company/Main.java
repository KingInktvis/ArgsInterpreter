package com.company;

public class Main {

    public static void main(String[] args) {
        String[] test = {"-o"};
        ArgsInterpreter reader = new ArgsInterpreter(test);

        System.out.print(reader.getValue("-i"));
    }
}
