package com.sujata.persistence;

import com.sujata.entity.Share;

import java.util.List;

public interface ShareDao {
    List<Share> getAllRecords();
    int insertRecord(Share share);

}
