package mappers;
import entities.shelude;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ОПТиТО on 27.02.2017.
 */
public interface sheludeMapper {
public int insert(int week, int day, Timestamp t1, Timestamp t2,int subject);
public shelude selectByID(int id);
}
