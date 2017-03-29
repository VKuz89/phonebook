package javaschool.app;

import asg.cliche.Command;
import asg.cliche.Shell;
import asg.cliche.ShellFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Record> recordList = new ArrayList<>();
    private Note n = new Note();

    @Command
    public void createPerson(String name, String email, String... phones) {
        person r = new person();
        r.setName(name);
        r.setEmail(email);
        r.addPhones(phones);

        recordList.add(r);
    }

    @Command
    public List<Record> list() {
        return recordList;
    }

    @Command
    public void addPhone(int id, String phone) { //является ли record personom
        for (Record r : recordList) {
            if (r instanceof person && r.getId() == id) {
                person p = (person) r; //приведение типов
                p.addPhones(phone);
                break;
            }
        }
    }

    @Command
    public void edit(int id) throws IOException {
        for (Record r : recordList) {
            if (r.getId() == id) {
                ShellFactory.createSubshell("#" + id, theShell, "Edit record", r)
                        .commandLoop();
                break;
            }
        }
    }

    @Command
    public List<Record> find(String str) {
        str = str.toLowerCase();
        List<Record> result = new ArrayList<>();
        for (Record r : recordList) {
            String name = r.getName().toLowerCase();
            String email;
            if (r instanceof person) {
                person p = (person) r;
                email = p.getEmail();
                email = p.getEmail().toLowerCase();
            } else {
                email = "";
            }
            if (name.contains(str) || email.contains(str)) {
                result.add(r);
            }
        }

        return result;
    }

    @Command
    public void createNote(String name, String note) {
        n.setNote(note);
        n.setName(name);
    }

    @Command
    public String note() {
        return n.getNote();
    }

    private Shell theShell;

    public void cliSetShell(Shell theShell) {
        this.theShell = theShell;
    }
}
