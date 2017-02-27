package mappers;

import entities.adress;

/**
 * Created by ОПТиТО on 27.02.2017.
 */
public interface adressMapper {
    adress getByID(long id);
    long insert(int aud, String adress);
}
