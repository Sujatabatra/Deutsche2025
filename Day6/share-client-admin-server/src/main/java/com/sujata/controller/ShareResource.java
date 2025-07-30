package com.sujata.controller;

import com.sujata.entity.Share;
import com.sujata.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShareResource {

    @Autowired
    private ShareService shareService;

    @GetMapping(path = "/shares",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Share> getAllDetails(){
        return shareService.getAllShares();
    }

    @PostMapping("/shares")
    public String saveRecord(@RequestBody Share share){
        if(shareService.insertShare(share))
            return "Record Added!";
        return "Insersion Failed";
    }

    @GetMapping(path = "/shares/{eid}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Share getRecordById(@PathVariable("eid") int id){
        return shareService.getShareById(id);
    }


    @DeleteMapping("/shares/{eId}")
    public String deleteRecord(@PathVariable("eId") int id){
        if(shareService.deleteShare(id))
            return "Deleted!";
        return "Deletion Failed";
    }

    @PutMapping("/shares/{id}/{mp}")
    public String updateRecord(@PathVariable("id") int id,@PathVariable("mp") int marketPrice){
        if(shareService.updateMarketPrice(id,marketPrice))
            return "Updated";
        return "Updation Failed";
    }

}
