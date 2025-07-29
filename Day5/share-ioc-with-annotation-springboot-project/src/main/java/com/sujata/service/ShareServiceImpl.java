package com.sujata.service;

import com.sujata.entity.Share;
import com.sujata.persistence.ShareDao;
import com.sujata.persistence.ShareDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


public class ShareServiceImpl implements ShareService {


//    private ShareDao shareDao=new ShareDaoImpl();

    private ShareDao shareDao;

    public void setShareDao(ShareDao shareDao) {
        this.shareDao = shareDao;
    }

    @Override
    public List<Share> getAllShares() {
        return shareDao.getAllRecords();
    }

    @Override
    public boolean insertShare(Share share) {
        return shareDao.insertRecord(share)>0;
    }
}
