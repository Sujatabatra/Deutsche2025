package com.sujata.share.presentation;

import com.sujata.share.entity.Share;
import com.sujata.share.service.ShareService;
import com.sujata.share.service.ShareServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class SharePresentationImpl implements SharePresentation {
    private ShareService shareService=new ShareServiceImpl();

    @Override
    public void showMenu() {
        System.out.println("1. Show All Shares");
        System.out.println("2. Insert New Share");
        System.out.println("3. Exit");
    }

    @Override
    public void performMenu(int choice) {
        Scanner scanner=new Scanner(System.in);
        switch (choice){
            case 1:
                ArrayList<Share> shareList=shareService.getAllShares();
                for(Share share:shareList){
                    System.out.println(share);
                }
                break;
            case 2:
                Share share=new Share();
                System.out.println("Enter Share ID : ");
                share.setShareId(scanner.nextInt());
                System.out.println("Enter Share Name : ");
                share.setShareName(scanner.next());
                System.out.println("Enter Marker Price : ");
                share.setMarketPrice(scanner.nextInt());
                System.out.println("Enter Issue Date (yyyy-mm-dd)");
                share.setIssueDate(LocalDate.parse(scanner.next()));
                if(shareService.saveShare(share))
                    System.out.println("New Share Added Successfully");
                else
                    System.out.println("Insertion Failed!");

                break;
            case 3:
                System.out.println("Thanks for using Share Management System");
                System.exit(0);
            default:
                System.out.println("Invalid Choice");
        }
    }
}
