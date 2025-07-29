package persistence;

import entity.Share;

import java.util.ArrayList;

public interface ShareDao {
    ArrayList<Share> getAllRecords();
    int insertRecord(Share share);
}
