package com.pixel;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

import java.time.LocalDate;
import java.util.Date;

@FixedLengthRecord(ignoreTrailingChars = true)
public class EmplPojo {

    @DataField(pos = 1,length = 3)
    private int id;
    @DataField(pos = 2,length = 10,trim = true, align = "L")
    private String name;
    @DataField(pos = 3,length = 8)
    private String role;
    @DataField(pos = 4, length = 7,pattern = "ddMMMyyyy")
    private Date doj;

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "EmplPojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", doj=" + doj +
                '}';
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
