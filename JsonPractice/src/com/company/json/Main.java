package com.company.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();
    public static final Path WRITE_PATH = Paths.get("./coffee.json");

    public static void main(String[] args) {
        Coffee[] coffees = {
                Coffee.makeCoffee("Espresso", 7, CupSize.L),
                Coffee.makeCoffee("Americano", 6, CupSize.M),
                Coffee.makeCoffee("Latte", 4, CupSize.S),
        };

        String gson = GSON.toJson(coffees);
//        System.out.println(gson);
//        writeJson(gson);

        readJson();

    }

    private static void writeJson(String object1) {
        Path writePath = Paths.get("./coffee.json");
        try {
            Files.writeString(WRITE_PATH, object1, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readJson() {
//        Path writePath = Paths.get("./coffe.json");
        try {
            FileReader reader = new FileReader(String.valueOf(WRITE_PATH));
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}
