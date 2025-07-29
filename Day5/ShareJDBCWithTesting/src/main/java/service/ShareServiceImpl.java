package service;

import entity.Share;
import persistence.ShareDao;
import persistence.ShareDaoImpl;

import java.util.ArrayList;

public class ShareServiceImpl implements ShareService {

//    private ShareDao shareDao=new ShareDaoImpl();

    private  ShareDao shareDao;

    public void setShareDao(ShareDao shareDao) {
        this.shareDao = shareDao;
    }

    @Override
    public ArrayList<Share> getAllShares() {
        return shareDao.getAllRecords();
    }

    @Override
    public boolean saveShare(Share share) {

        return shareDao.insertRecord(share)>0;
    }
}
