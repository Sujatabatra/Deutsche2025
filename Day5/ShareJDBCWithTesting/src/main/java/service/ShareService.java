package service;

import entity.Share;

import java.util.ArrayList;

public interface ShareService {

    ArrayList<Share> getAllShares();
    boolean saveShare(Share share);
}
