package org.example.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class Bus {
    private String company;
    private String busNum;
    private String source;
    private String destination;
    private Date startTime;
    private Date endTime;
    private int capacity;
    private int available;

    private int dow;

    public Bus(String company, String busNum, String source, String destination, Date startTime, Date endTime, int capacity, int available, int dow) {
        this.company = company;
        this.busNum = busNum;
        this.source = source;
        this.destination = destination;
        this.startTime = startTime;
        this.endTime = endTime;
        this.capacity = capacity;
        this.available = available;
        this.dow = dow;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setBusNum(String busNum) {
        this.busNum = busNum;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public void setDow(int dow) {
        this.dow = dow;
    }

    public String getCompany() {
        return company;
    }

    public String getBusNum() {
        return busNum;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAvailable() {
        return available;
    }

    public int getDow() {
        return dow;
    }

    public enum DOW{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    };
}
