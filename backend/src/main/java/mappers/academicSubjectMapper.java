package mappers;

import entities.academicSubject;

/**
 * Created by ОПТиТО on 27.02.2017.
 */
public interface academicSubjectMapper   {
    academicSubject getById(long id);
    long inseert(String name, String department);
}
