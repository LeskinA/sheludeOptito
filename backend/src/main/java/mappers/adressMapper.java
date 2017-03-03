package mappers;

import entities.adress;
import org.apache.ibatis.annotations.*;

/**
 * Created by ОПТиТО on 27.02.2017.
 */
public interface adressMapper {
    @Select("SELECT " +
            "id, " +
            "aud, " +
            "adress " +
            "FROM ADRESS " +
            "WHERE id = #{id}")
    adress getByID(long id);
    @Insert(
            "INSERT INTO ADRESS" +
            "(id," +
            "aud," +
            "adress)" +
            "VALUES(#{id}," +
            "#{aud}," +
            "#{adress})"
    )
    long insert(int aud, String adress);
}
