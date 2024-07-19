package com.example.demo;

import java.util.Scanner;

public class ScannerInputReader implements InputReader {
    private final Scanner scanner;

    public ScannerInputReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public int nextInt() {
        return scanner.nextInt();
    }

    @Override
    public String nextLine() {
        return scanner.nextLine();
    }

    @Override
    public double nextDouble() {
        return scanner.nextDouble();
    }
}
