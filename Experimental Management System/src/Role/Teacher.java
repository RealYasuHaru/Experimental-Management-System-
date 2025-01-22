package Role;

import Experiment.Experiment;
import Experiment.ExperimentDao;
import mysql.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Teacher extends User{

    public Teacher(String id, String password, String name, char sex, int age, String city, String type) {
        super(id, password, name, sex, age, city, type);
    }


}
