package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Song song=new Song("Kyrgyzstan\n","Omar\n","Тарыхы бар нечен, \n" +
                "Ынтымагы дайым бекем. \n" +
                "Ала-Тоо - бешигим, \n" +
                "Башым ийип, таазим этем. \n" +
                "Керемет аймагы, \n" +
                "Желбиреп турсун байрагы. \n" +
                "Булагың таш жарып, \n" +
                "Булбулдай сайрагын. ");

        String songText="Название: "+song.getTitle()+"Автор: "+song.getAuthor()+"Текст: "+song.getText();

        FileWriter fileWriter=new FileWriter("Song txt");
        fileWriter.write(songText);
        fileWriter.close();

        FileReader fileReader=new FileReader("Song txt");
        Scanner scanner=new Scanner(fileReader);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
