package mappers;

import entities.academicSubject;

import java.util.List;

/**
 * Created by ОПТиТО on 27.02.2017.
 */
public interface academicSubjectMapper   {
    academicSubject getById(long id);
    List<academicSubject> getALL();
    long insert(String name, String department);
   // long update
}
