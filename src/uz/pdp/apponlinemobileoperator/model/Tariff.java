package uz.pdp.apponlinemobileoperator.model;

import uz.pdp.apponlinemobileoperator.model.template.AbsInit;

public class Tariff extends AbsInit {
    private String name;
    private MobileCompany mobileCompany;
    private double payment;
    private int megabyte;
    private int minute;
    private int sms;

    private double priceMegabyteWithoutLimit;
    private double priceMinuteWithoutLimit;
    private double priceSMSWithoutLimit;
}
