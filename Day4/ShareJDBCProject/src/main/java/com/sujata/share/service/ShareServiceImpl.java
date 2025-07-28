package com.sujata.share.service;

import com.sujata.share.entity.Share;
import com.sujata.share.persistence.ShareDao;
import com.sujata.share.persistence.ShareDaoImpl;

import java.util.ArrayList;

public class ShareServiceImpl implements ShareService {

    private ShareDao shareDao=new ShareDaoImpl();

    @Override
    public ArrayList<Share> getAllShares() {
        return shareDao.getAllRecords();
    }

    @Override
    public boolean saveShare(Share share) {

        return shareDao.insertRecord(share)>0;
    }
}
