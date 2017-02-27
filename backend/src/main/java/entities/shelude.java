package entities;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ОПТиТО on 27.02.2017.
 */
public class shelude {
    private long id;
    private int weekType;
    private int day;
    private Timestamp time1;
    private Timestamp time2;
    private adress adress;
    private academicSubject subject;
    private List<group> groups;

    public shelude(long id, int weekType, int day, Timestamp time1, Timestamp time2, entities.adress adress, academicSubject subject1, List<group> groups) {
        this.id = id;
        this.weekType = weekType;
        this.day = day;
        this.time1 = time1;
        this.time2 = time2;
        this.adress = adress;
        this.subject = subject1;
        this.groups = new ArrayList<group>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getWeekType() {
        return weekType;
    }

    public void setWeekType(int weekType) {
        this.weekType = weekType;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Timestamp getTime1() {
        return time1;
    }

    public void setTime1(Timestamp time1) {
        this.time1 = time1;
    }

    public Timestamp getTime2() {
        return time2;
    }

    public void setTime2(Timestamp time2) {
        this.time2 = time2;
    }

    public entities.adress getAdress() {
        return adress;
    }

    public void setAdress(entities.adress adress) {
        this.adress = adress;
    }

    public academicSubject getSubject() {
        return subject;
    }

    public void setSubject(academicSubject subject) {
        this.subject = subject;
    }

    public List<group> getGroups() {
        return groups;
    }

    public void addGroup(group groups) {
        this.groups.add(groups);
    }
}
