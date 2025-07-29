package service;

import entity.Share;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import persistence.ShareDao;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ShareServiceImplTest {

    @InjectMocks
    ShareService shareService=new ShareServiceImpl();

    @Mock
    ShareDao shareDao;

    @Test
    void getAllShares() {
        ArrayList<Share> shares=new ArrayList<>();
        shares.add(new Share());
        shares.add(new Share());
        shares.add(new Share());

        //Specified the Mock behaviour
        when(shareDao.getAllRecords()).thenReturn(shares);

        assertEquals(shares,shareService.getAllShares());

    }

    @Test
    void saveShare() {

//        when(shareDao.insertRecord(new Share())).thenReturn(1);
//
//        assertEquals(1,shareService.saveShare(new Share()));

        Share share=new Share();
        shareService.saveShare(share);
        //checking the dao layer insert record get exactly one time call
        verify(shareDao,times(1)).insertRecord(share);

    }
}