package com.pixel;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;
import java.util.Date;

@FixedLengthRecord(ignoreTrailingChars = true)
public class TfilePojo {

    @DataField(pos = 1, length = 3)
    private String symbol;
    @DataField(pos = 2, length = 4)
    private int bate;
    @DataField(pos = 3, length = 2)
    private String uname;
    @DataField(pos = 4,length = 13,pattern = "ddMMMyyyy hh:mm", trim = true,align = "L")
    private Date date;



    @Override
    public String toString() {
        return "TfilePojo{" +
                "symbol='" + symbol + '\'' +
                ", bate=" + bate +
                ", uname='" + uname + '\'' +
                ", date=" + date +
                '}';
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getBate() {
        return bate;
    }

    public void setBate(int bate) {
        this.bate = bate;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

