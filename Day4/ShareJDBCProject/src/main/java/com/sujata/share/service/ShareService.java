package com.sujata.share.service;

import com.sujata.share.entity.Share;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface ShareService {

    ArrayList<Share> getAllShares();
    boolean saveShare(Share share);
}
