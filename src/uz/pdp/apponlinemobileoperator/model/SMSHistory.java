package uz.pdp.apponlinemobileoperator.model;

import uz.pdp.apponlinemobileoperator.model.enums.SimCardStatus;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

public class SMSHistory {
    private UUID id;
    private SimCard from;
    private SimCard to;
    private Timestamp when = Timestamp.valueOf(LocalDateTime.now());
    private String message;
    private SimCardStatus toStatus;
}
