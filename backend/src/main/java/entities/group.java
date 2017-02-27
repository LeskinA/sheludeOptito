package entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ОПТиТО on 27.02.2017.
 */
public class group {
    private long id;
    private int number;
    private String faculty;
    private int year;
    private List<shelude> subject;

    public group(long id, int number, String faculty, int year) {
        this.id = id;
        this.number = number;
        this.faculty = faculty;
        this.year = year;
        this.subject = new ArrayList<shelude>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<shelude> getSubject() {
        return subject;
    }

    public void saddSubject(shelude subject) {
        this.subject.add(subject);
    }
}
