package com.sujata.service;

import com.sujata.entity.Share;
import com.sujata.persistence.ShareDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service("service")
public class ShareServiceImpl implements ShareService {


    @Autowired
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

    @Override
    public boolean deleteShare(int id) {
        if(!shareDao.existsById(id)){
            return false;
        }
        else
            shareDao.deleteById(id);
        return true;
    }

    @Override
    public boolean updateMarketPrice(int id, int marketPrice) {
        Optional<Share> opShare= shareDao.findById(id);

        if(opShare.isPresent()){
            Share share=opShare.get();
            share.setMarket_price(marketPrice);
            shareDao.save(share);
            return true;
        }

        return false;

    }

    @Override
    public Share getShareById(int id) {
        Optional<Share> opShare= shareDao.findById(id);
        if(opShare.isPresent()) {
            Share share = opShare.get();
            return share;
        }

        return null;
    }
}
