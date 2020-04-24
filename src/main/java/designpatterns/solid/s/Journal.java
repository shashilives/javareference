package designpatterns.solid.s;import java.util.ArrayList;import java.util.List;public class Journal {    List<String> entries = new ArrayList<>();    int index = 0;    public void addEntry(String item) {        entries.add("" + (++index) + " - " + item);    }    public void removeEntry(int index) {        entries.remove(index);    }    @Override    public String toString() {        return String.join(System.lineSeparator(), entries);    }}