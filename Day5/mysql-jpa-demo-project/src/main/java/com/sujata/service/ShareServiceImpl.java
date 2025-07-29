package com.sujata.service;

import com.sujata.entity.Share;
import com.sujata.persistence.ShareDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component("service")
@Service("service")
public class ShareServiceImpl implements ShareService {


//    private ShareDao shareDao=new ShareDaoImpl();

    @Autowired
//    @Qualifier("dao") //Optional, we have just one implementation class to be autowired
    private ShareDao shareDao;

    public void setShareDao(ShareDao shareDao) {
        this.shareDao = shareDao;
    }

    @Override
    public List<Share> getAllShares() {
        return shareDao.findAll();
    }

    @Override
    public boolean insertShare(Share share) {
        if(shareDao.existsById(share.getShareId())){
            return false;
        }
        else
            shareDao.save(share);
            return true;
    }
}
