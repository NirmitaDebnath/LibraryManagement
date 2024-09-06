package main;

import management.LibraryManager;

public class App {
    public static void main(String[] args){
        LibraryManager libraryManager = LibraryManager.getInstance();
        libraryManager.start();
    }
}
