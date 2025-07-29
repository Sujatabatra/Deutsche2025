package com.sujata.presentation;

import com.sujata.entity.Share;
import com.sujata.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

@Component("presentation")
public class SharePresentationImpl implements SharePresentation {

    private ShareService shareService;

    public SharePresentationImpl(@Autowired @Qualifier("service") ShareService shareService) {
        this.shareService = shareService;
    }

    @Override
    public void showMenu() {
        System.out.println("1. Display All Shares");
        System.out.println("2. Insert New Share");
        System.out.println("3. Exit");
    }

    @Override
    public void performChoice(int choice) {
        Scanner scanner=new Scanner(System.in);
        switch (choice){
            case 1:
                List<Share> shares=shareService.getAllShares();
                for(Share share:shares){
                    System.out.println(share);
                }
                break;
            case 2:
                Share share=new Share();
                System.out.println("Enter Share Id");
                share.setShareId(scanner.nextInt());
                System.out.println("Enter Share Name : ");
                share.setShareName(scanner.next());
                System.out.println("Enter Market Price : ");
                share.setMarket_price(scanner.nextInt());
                System.out.println("Enter Issue Date (yyyy-mm-dd)");
                share.setIssueDate(LocalDate.parse(scanner.next()));

                if(shareService.insertShare(share))
                    System.out.println("New Share Added");
                else
                    System.out.println("Insertion Failed!");
                break;
            case 3:
                System.out.println("Thanks for Using Share Management System");
                System.exit(0);
            default:
                System.out.println("Invalid Choice");
        }
    }
}
