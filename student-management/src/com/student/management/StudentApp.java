package com.student.management;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StudentApp {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Student> slist=new ArrayList<Student>();
	StudentApp()
    {
        
        slist.add(new Student(101,"Ajith","Thoothukudi",1,"EIE",948697655));
        slist.add(new Student(102,"Anand","Kovilpatti",2,"EIE",866772819));
        slist.add(new Student(103,"Nivas","Thirunelveli",3,"EIE",856792436));
        slist.add(new Student(104,"Balaji","Sivakasi",4,"EIE",896574123));
        slist.add(new Student(105,"Karthik","Sivakasi",5,"EIE",689726552));
        slist.add(new Student(106,"Vasanth","Kovilpatti",6,"EIE",866775896));
        slist.add(new Student(107,"Abarna","Kovilpatti",7,"EIE",569745623));
        slist.add(new Student(108,"Nandha","Thoothukudi",8,"EIE",558962553));
        slist.add(new Student(109,"Sudhan","Nagercoil",9,"EIE",996685363)); 
        slist.add(new Student(110,"Bala","Dindugal",10,"EIE",995884563)); 
    }
	
	//InsertStudentInfo Method
	synchronized public void insertStudentInfo() throws NumberFormatException, IOException
    {
        System.out.println("Enter Student Id:");
        int studentId=Integer.parseInt(br.readLine());
        
        System.out.println("Enter Student Name:");
        String studentName=br.readLine();
        
        System.out.println("Enter Student Address:");
        String studentAddress=br.readLine();
        
        System.out.println("Enter Student RollNo:");
        int studentRoll=Integer.parseInt(br.readLine());
        
        System.out.println("Enter Student Department:");
        String studentDepartment=br.readLine();
        
        System.out.println("Enter Student Contact Number:");
        int studentContact=Integer.parseInt(br.readLine());
        
        Student student=new Student(studentId,studentName,studentAddress,studentRoll,studentDepartment,studentContact);
        
        slist.add(student);
        System.out.println("-------------------------------------------------------------------------------------------");    
    }
    
    //ViewStudentInfo Method
	synchronized public void viewStudentInfoByStudentId() throws NumberFormatException, IOException
    {
        System.out.println("Enter Student Id:");
        int studentId=Integer.parseInt(br.readLine());
        int flag=0;
        for(Student student:slist)
        {
            if(studentId==student.getStudentId())
            {
            flag=1; 
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.print("Name:"+student.getStudentName()+"\t"+"Address:"+student.getStudentAddress()+"\t"+"Roll:"+student.getStudentRoll()+"\t"+"Department:"+student.getStudentDepartment()+"\t"+"Contact No:"+student.getContactNo()+"\n");
            System.out.println("----------------------------------------------------------------------------------------");
            }
        }
        
        if(flag==0)
        {
            System.out.println("Student record does not exist!!");
        }   
    }
    
    //DeteteStudentInfo Method
	synchronized public void deteteStudentInfoByStudentId() throws NumberFormatException, IOException
    {
        System.out.println("Enter Student Id:");
        int studentId=Integer.parseInt(br.readLine());
        int flag=0;
        Student st=new Student();
        for(Student s:slist)
        {
            if(studentId==s.getStudentId())
            {
            flag=1;
            st=s;       
            }
        }
                
        if(flag==0)
        {
            System.out.println("Student id does not exist!!");
        }
        else
        {
           slist.remove(st);
           System.out.println("Student information deleted Succesfully!!");
         }
    }
  
    //UpdateStudentInfo Method
	synchronized public void updateStudentInfoByStudentId() throws NumberFormatException, IOException
    {
        System.out.println("Enter Student Id:");
        int studentId=Integer.parseInt(br.readLine());

        int flag=0;
        for(Student s:slist)
        {
            if(studentId==s.getStudentId())
            {
              flag=1;   
              int index=slist.indexOf(s);
               System.out.println("Enter Student Name:");
                String studentName=br.readLine();
                
                System.out.println("Enter Student Address:");
                String studentAddress=br.readLine();
                
                System.out.println("Enter Student RollNo:");
                int studentRoll=Integer.parseInt(br.readLine());
                
                System.out.println("Enter Student Department:");
                String studentDepartment=br.readLine();
                
                System.out.println("Enter Student Contact Number:");
                int studentContact=Integer.parseInt(br.readLine());
              s.setStudentName(studentName);
              s.setStudentAddress(studentAddress);
              s.setStudentRoll(studentRoll);
              s.setContactNo(studentContact);
              s.setStudentDepartment(studentDepartment);
              slist.set(index, s);
            }
        }
        
        if(flag==1)
            System.out.println("Student record updated!!");
        else
            System.out.println("Student Id does not exist!!");
    }
             
    //ViewAllStudentInfo Method
	synchronized public void viewAllStudentInfo() throws NumberFormatException, IOException
    {
        if(slist.size()>0)
        {
        
        for(Student student:slist)
        {
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.print("Name:"+student.getStudentName()+"\t"+"Address:"+student.getStudentAddress()+"\t"+"Roll:"+student.getStudentRoll()+"\t"+"Department:"+student.getStudentDepartment()+"\t"+"Contact No:"+student.getContactNo()+"\n");
            System.out.println("--------------------------------------------------------------------------------------");
        }
        }
        else
        {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("No record found!!");
            System.out.println("-------------------------------------------------------------------------------------");
        }
    }
    
    //removeAllStudentInfo Method    
	synchronized public void removeAllStudentInfo() throws NumberFormatException, IOException
    {
    	if(slist.size()>0) 
    	{
    		slist.clear();
    	}
    	else 
    	{
    		System.out.println("No Records Avaliable!!");
    	}
        
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        StudentApp app=new StudentApp();
        
        System.out.println("---------------------------------------------------------------");
        System.out.println("                Student Management System                      ");
        System.out.println("---------------------------------------------------------------");
        String c=null;
        do
        {
        System.out.println("\t\t 1)Insert New Student data.\r\n"
                + "\t\t 2)View Student Data.\r\n"
                + "\t\t 3)Delete Student Data.\r\n"
                + "\t\t 4)Update Student Data.\r\n"
                + "\t\t 5)View all Student Data.\r\n"
                + "\t\t 6)Detete all Student Data.");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Enter Your Choice:");
        int choice=Integer.parseInt(br.readLine());
        System.out.println("---------------------------------------------------------------");
    
        
        switch(choice)
        {
          case 1:app.insertStudentInfo(); 
                System.out.println("Student information inserted Successfully!!");
                break;
          case 2:app.viewStudentInfoByStudentId();
                break;
          case 3:app.deteteStudentInfoByStudentId();
                break;
          case 4:app.updateStudentInfoByStudentId();
                break;
          case 5:app.viewAllStudentInfo();
                 System.out.println("View all Student Information:");
                break;
          case 6:app.removeAllStudentInfo();
                 System.out.println("All records are deleted!!");
                break;
          default:System.out.println("Wrong Choice!!");
                break;
        
        }
        
        System.out.println("Do you want to continue?(Y->Yes / N->No)");
        c=br.readLine();
            
        }while(c.equals("Y")|| c.equals("y"));
    }
}
