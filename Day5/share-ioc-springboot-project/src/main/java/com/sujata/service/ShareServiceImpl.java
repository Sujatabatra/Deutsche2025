package com.sujata.service;

import com.sujata.entity.Share;
import com.sujata.persistence.ShareDao;
import com.sujata.persistence.ShareDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("service")
public class ShareServiceImpl implements ShareService {


//    private ShareDao shareDao=new ShareDaoImpl();

    @Autowired
    @Qualifier("dao") //Optional, we have just one implementation class to be autowired
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
