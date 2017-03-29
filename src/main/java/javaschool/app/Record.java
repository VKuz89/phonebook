package javaschool.app;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

public abstract class Record {
    private static int count = 0;
    private int id;
    private String name;
    private String email;
    private final List<String> phones = new ArrayList<>();

    public Record() {
        count++;
        id = count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Command
    public void setName(String name) {
        this.name = name;
    }
}




