package Experiment;

import mysql.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Experiment {
    public String e_name;
    public String content;
    public String request;

    public Experiment(String e_name, String content, String request) {
        this.e_name = e_name;
        this.content = content;
        this.request = request;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getcontent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

}
