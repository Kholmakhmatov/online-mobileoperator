package uz.pdp.apponlinemobileoperator.model;

import uz.pdp.apponlinemobileoperator.model.template.AbsInit;

public class SimCard extends AbsInit {
    private String phoneNumber;
    private MobileCompany mobileCompany;
    private Tariff tariff;
    private User owner;

    private String pinCode;

    private double balance;

    private int megabyte;
    private int minute;
    private int sms;

}
