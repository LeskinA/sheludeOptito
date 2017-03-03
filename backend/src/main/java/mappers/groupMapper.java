package mappers;
import entities.group;

import java.util.Date;
import java.util.List;

/**
 * Created by ОПТиТО on 27.02.2017.
 */
public interface groupMapper {
public int insert(int number, Date date, String faculty);
public group selectByID(int id);
public group selectByNumber(int number);
public List<group> selectByID(List<group> id);

}
