package javaschool.app;

/**
 * Created by JavaCourses on 29.03.2017..
 */
public class Note extends Record {
    private String Note;

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + getNote();
    }


}
