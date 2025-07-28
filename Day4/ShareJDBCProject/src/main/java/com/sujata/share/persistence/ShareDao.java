package com.sujata.share.persistence;

import com.sujata.share.entity.Share;

import java.util.ArrayList;

public interface ShareDao {
    ArrayList<Share> getAllRecords();
    int insertRecord(Share share);
}
