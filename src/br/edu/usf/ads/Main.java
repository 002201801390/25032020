package br.edu.usf.ads;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            task1();
            task2();

        } catch (Throwable e) {
            Log.ERRO(Main.class, "Something went very wrong fellas", e);

        } finally {
            Log.close();
        }
    }

    private static void task1() throws Exception {
        try {
            long ini, end;
    
            Log.INFO("Starting task 1...");
            ini = System.currentTimeMillis();
    
            Object i = 1024;
            File f = (File) i;
    
            end = System.currentTimeMillis();
            Log.INFO("Completed in " + (end - ini) + " milliseconds");
            
        } catch (ClassCastException e) {
            Log.ERRO("1024 it's not a File type i guess...");

        } catch (Exception e) {
            Log.ERRO("Some error occurred...");
            throw e;
        }
    }

    private static void task2() throws Exception {
        // Try with resources...sources...ources...s [this should be an echo >.<]
        try (Scanner s = new Scanner(System.in)) {

            System.out.print("Type something: ");
            s.next();
            System.out.println();

            System.out.print("Great! Now type a integer: ");
            s.nextInt();
            System.out.println();

            System.out.print("Awesome! Now type a something that is not a integer: ");
            s.nextInt();
            System.out.println();

            System.out.println("Hmmmmmmmmmmm... Suspicius");
            System.out.println("i don't like that...");

            Thread.sleep(1000);
            System.out.println("because...");
            Thread.sleep(1000);
            System.out.println("IM A PICKLE");
            Thread.sleep(1000);

            throw new IllegalArgumentException("I got cheeted, and I don't like it");

        } catch (Exception e) {
            Log.ERRO("Someone was cheated, and I hope it wasn't me >:T", e);
            throw e;
        }
    }
}