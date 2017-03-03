package mappers;

import entities.group;
import entities.shelude;

import java.util.List;

/**
 * Created by ОПТиТО on 03.03.2017.
 */
public interface groupSheludeMapper {
    public void add(int sheludeID, int groupID);
    public List<shelude> getSheluds(int groupID);
    public List<group> getGroups(int sheludeID);
}
