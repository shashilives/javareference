package designpatterns.solid.s;import java.io.File;import java.io.FileNotFoundException;import java.io.IOException;import java.io.PrintStream;import java.util.List;public class Persistance {    public void saveToFile(List<?> entries, String filename, boolean override) {        if (override || new File(filename).exists()) {            try (PrintStream printStream = new PrintStream(new File(filename))) {                printStream.println(entries);            } catch (FileNotFoundException e) {                e.printStackTrace();            }        }    }    public void loadFromFile(String filepath) throws IOException {        Runtime.getRuntime().exec("notepad.exe " + filepath);    }}