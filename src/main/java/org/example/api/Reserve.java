package org.example.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;


public class Reserve {
    private String userName;
    private String busNum;
    private Date book;
    private int numberBooked;
    public String getUserName() {
        return userName;
    }

    public String getBusNum() {
        return busNum;
    }

    public Date getBook() {
        return book;
    }

    public int getNumberBooked() {
        return numberBooked;
    }

    public Reserve(String userName, String busNum, Date book, int numberBooked) {
        this.userName = userName;
        this.busNum = busNum;
        this.book = book;
        this.numberBooked = numberBooked;
    }


}
