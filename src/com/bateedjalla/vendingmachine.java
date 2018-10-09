package com.bateedjalla;

import java.util.Scanner;

public class vendingmachine {
    public static void main(String[] args) {
        String antwoord;
        String akoord;

        String product;
        System.out.println("Welkom!\nwilt u iets drinken");
        Scanner s = new Scanner(System.in);
        antwoord = s.next();


        if (antwoord.equals("ja")){

            System.out.println("Wat wilt u hebben?\nFanta: $0,90\nSprite: $0,90\nCola: $0,90\nCassis: $1,-\nFanandes: $1,20\nRed Bull: $2,-");
            product = s.next();
            if(product.equals("fanta")){
                System.out.println("Dat word dan $0,90\ntype in \"akkoord\" voor om te betalen");
                akoord = s.next();
                if (akoord.equals("akkoord")){
                    System.out.println("Betalling succesvol\nTot Ziens");
                }else{
                    System.out.println("Probeer het nog eens.");
                    }
            }else if(product.equals("cola")){
                System.out.println("Dat word dan $0,90\ntype in \"akkoord\" voor om te betalen");
                akoord = s.next();
                if (akoord.equals("akkoord")){
                    System.out.println("Betalling succesvol\nTot Ziens");
                }else{
                    System.out.println("Probeer het nog eens.");
                    }
            }else if(product.equals("sprite")){
                System.out.println("Dat word dan $0,90\ntype in \"akkoord\" voor om te betalen.");
                akoord = s.next();
                if (akoord.equals("akkoord")){
                    System.out.println("Betalling succesvol\nTot Ziens");
                }else{
                    System.out.println("Probeer het nog eens.");
                    }
            }else if(product.equals("cassis")){
                System.out.println("Dat word dan $1,-\\ntype in \"akkoord\" voor om te betalen.");
                akoord = s.next();
                if (akoord.equals("akkoord")){
                    System.out.println("Betalling succesvol\nTot Ziens");
                }else{
                    System.out.println("Probeer het nog eens.");
                    }
            }else if(product.equals("fanandes")){
                System.out.println("Dat word dan $1,20\\ntype in \"akkoord\" voor om te betalen.");
                akoord = s.next();
                if (akoord.equals("akkoord")){
                    System.out.println("Betalling succesvol\nTot Ziens");
                }else{
                    System.out.println("Probeer het nog eens.");
                }
            }else if(product.equals("redbull")){
                System.out.println("Dat word dan $2,-\\ntype in \"akkoord\" voor om te betalen.");
                akoord = s.next();
                if (akoord.equals("akkoord")){
                    System.out.println("Betalling succesvol\nTot Ziens");
                }else {
                    System.out.println("Probeer het nog eens.");
                }
            }else{System.out.println("Sorry,\nIk heb het niet goed verstaan.\nprobeer de volgende keer met Hoofdletters aan het begin van ieder woord");
            }



        } else if(antwoord.equals("nee")){
            System.out.println("oké, Wat doe je hier dan?");
        }else{
            System.out.println("Ik verstond u niet.");
        }
    }
}
