package Experiment;

import mysql.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExperimentDao {
    public int CreateExperiment(String name, String content, String request) {

        Connection conn =null;
        int flag = 0;
        conn = DbUtil.getConnection();
        String sql = "INSERT INTO Experiment(name,content,request) VALUES(?,?,?)";
        //准备SQL语句
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
            pstmt.setString(2,content);
            pstmt.setString(3,request);
            //执行SQL语句
            flag = pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭连接
            DbUtil.closeConnection();
        }
        return flag;
    }
    public int deleteExperiment(int id) {
        Connection conn = null;
        int flag = 0;
        conn = DbUtil.getConnection();
        String sql = "DELETE FROM experiment WHERE id=?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            flag = pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DbUtil.closeConnection();
        }
        return flag;
    }

    public class TestDeleteExperiment {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要删除的实验编号：");
            int id = sc.nextInt();
            ExperimentDao experimentDao = new ExperimentDao();
            int flag = experimentDao.deleteExperiment(id);
            if (flag == 1) {
                System.out.println("成功");
            }else {
                System.out.println("失败");
            }
        }
    }

    public class TestAddExperiment {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入实验名称：");
            String name = sc.next();
            System.out.println("请输入实验内容：");
            String content = sc.next();
            System.out.println("请输入实验要求：");
            String request = sc.next();
            ExperimentDao experimentDao = new ExperimentDao();
            int flag = experimentDao.CreateExperiment("","","");
            if (flag == 0) {
                System.out.println("失败");
            }else {
                System.out.println("成功");
            }
        }
    }
}
