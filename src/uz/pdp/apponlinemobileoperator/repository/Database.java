package uz.pdp.apponlinemobileoperator.repository;

import uz.pdp.apponlinemobileoperator.model.*;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<User> users = new ArrayList<>();
    public static List<MobileCompany> mobileCompanies = new ArrayList<>();
    public static List<Tariff> tariffs = new ArrayList<>();
    public static List<SimCard> simCards = new ArrayList<>();
    public static List<CallHistory> callHistories = new ArrayList<>();
    public static List<SMSHistory> smsHistories = new ArrayList<>();
}
