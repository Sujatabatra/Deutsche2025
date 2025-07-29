package com.sujata.share.client;

import presentation.SharePresentation;
import presentation.SharePresentationImpl;

import java.util.Scanner;

public class ShareApplication {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        SharePresentation sharePresentation=new SharePresentationImpl();
        while(true){
            sharePresentation.showMenu();
            System.out.println("Enter Choice ");
            int choice=scanner.nextInt();
            sharePresentation.performMenu(choice);
        }

    }
}
