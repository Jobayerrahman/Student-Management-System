package DAOLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import EntityLayer.*;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class StudentDAO {
	
	private Connection myCon;
	
	public StudentDAO()
	{
		try
		{
			myCon= DriverManager.getConnection("jdbc:mysql://localhost:3306/SMS", "root", "");
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "Connection Unsuccesfull");
		}
	}
	
	public ArrayList<Student> GetAllStudent()
	{
		ArrayList<Student> student= new ArrayList<Student>();
		Statement myStatement=null;
		ResultSet myResultSet= null;
		
		try
		{
			if(myCon==null)
			{
				throw(new Exception("Connection Unsuccesful"));
			}
			myStatement= (Statement) myCon.createStatement();
			myResultSet = myStatement.executeQuery("select * from Student");
			
			while(myResultSet.next())
			{
				Student stu = ConvertRowToStudent(myResultSet);
				student.add(stu);
			}
			
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
		finally
		{
			close(myStatement,myResultSet,null);	  
		}
		
		
		
		return student;
	}
	
	private Student ConvertRowToStudent(ResultSet myResult) throws SQLException
	{
		Student stu= new Student();
		stu.setId(myResult.getInt("Id"));
		stu.setName(myResult.getString("Name"));
		stu.setAge(myResult.getInt("Age"));
		stu.setDOB(myResult.getString("DOB"));
		stu.setCls(myResult.getString("Class"));
		return stu;
	}
	
	private void close(Statement myStatement, ResultSet myResultSet,PreparedStatement preparedstatement)
	{
		try
		{
			if(myStatement!=null)
				  myStatement.close();
				if(myResultSet!=null)
				  myResultSet.close();
				if(preparedstatement!=null)
					preparedstatement.close();
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
	}

}

