package com.company;

import com.company.dao.DAOConnection;
import com.company.dao.OracleDAOConnection;
import com.company.dao.WebLogicDAOConnection;
import com.company.entities.Student;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DAOConnection daoConnection = WebLogicDAOConnection.getInstance();
        List<Student> studentList = daoConnection.selectAllStudents();
        for (Student student: studentList) {
            System.out.println(student);
        }
        studentList = daoConnection.selectAllStudents();
        for (Student student: studentList) {
            System.out.println(student);
        }
    }
}
