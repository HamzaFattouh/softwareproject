package sakanat;

import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;


public class user {

	private static boolean userlogedin = false;
	protected static String usertype = null;
	protected static String user_name=null;
	protected static String address=null;
	protected static String phone_number=null;
	protected static String email=null;
	protected static String Gender=null;
	protected static String birth_date=null;
	
	
	//constructor
	public user(String userName, String userType, String address, String phoneNumber, String email, String gender, String birthDate) {
        this.user_name = userName;
        this.usertype = userType;
        this.address = address;
        this.phone_number = phoneNumber;
        this.email = email;
        this.Gender = gender;
        this.birth_date = birthDate;
    }
	
	public user(String...variable) {
		
		for(int i=0 ; i<variable.length ; i++) {
			switch(i){
			case 0: this.user_name=variable[0];    break;
			case 1: this.usertype=variable[1];     break;
			case 2: this.address=variable[2];      break;
			case 3: this.phone_number=variable[3]; break;
			case 4: this.email=variable[4];        break;
			case 5: this.Gender=variable[5];       break;
			case 6: this.birth_date=variable[6];   break;
			}
		}
	}
	
	
	//getter
	public static String getusertype() {
		return usertype;
	}
	
	public static boolean getuserlogedin() {
		return userlogedin;
	}
	
	public static String getUserName() {
        return user_name;
    }

    public static String getAddress() {
        return address;
    }

    public static String getPhoneNumber() {
        return phone_number;
    }

    public static String getEmail() {
        return email;
    }

    public static String getGender() {
        return Gender;
    }

    public static String getBirthDate() {
        return birth_date;
    }
    //setter
    public static void setUserType(String usertype) {
    	user.usertype = usertype;
    }
    
    public static void setUserName(String userName) {
        user_name = userName;
    }

    public static void setAddress(String address) {
        user.address = address;
    }

    public static void setPhoneNumber(String phoneNumber) {
        phone_number = phoneNumber;
    }

    public static void setEmail(String email) {
        user.email = email;
    }

    public static void setGender(String gender) {
        Gender = gender;
    }

    public static void setBirthDate(String birthDate) {
        birth_date = birthDate;
    }
	
	public static void login(String name,String password) {
		user u=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakanat", "root", "");
			Statement stmt =c.createStatement();
			String sql="Select * from user where username='"+name+"' and password= '"+password+"'";
			ResultSet rs =stmt.executeQuery(sql);
			if(rs.next()) {
				userlogedin  = true;
				usertype     = rs.getString("user_type");
				user_name    = rs.getString("username");
				address      = rs.getString("address");
				phone_number = rs.getString("phone_number");
				email        = rs.getString("email");
				Gender       = rs.getString("gender");
				birth_date   = rs.getString("birth_date");
			}
			
			c.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	
	
	public static void logout() {
		usertype = null;
		userlogedin = false;
	}
	
	
	
	public static void adduser(user a,String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakanat", "root", "");
			Statement stmt=c.createStatement();
			String sql="insert into user (username, password, user_type, address, phone_number, gender, birth_date, email)" 
			         + "values('"+a.user_name +"','"+ password +"','"+ a.usertype +"','"+ a.address +"','"+ a.phone_number +"','"+a.Gender+"','"
			         		 +a.birth_date +"','"+ a.email+"' );"; 
			stmt.executeUpdate(sql);
			
			c.close();

            
	    }catch(Exception e){
			System.out.println(e);}
		
	}
	
	public static ArrayList<user> getuser() {
		ArrayList<user> users = new ArrayList<user>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakanat", "root", "");
            Statement stmt = c.createStatement();
            String sql = "SELECT * FROM user";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                user u = new user();
                u.usertype = rs.getString("user_type");
                u.user_name = rs.getString("username");
                u.address = rs.getString("address");
                u.phone_number = rs.getString("phone_number");
                u.email = rs.getString("email");
                u.Gender = rs.getString("gender");
                u.birth_date = rs.getString("birth_date");
                users.add(u);
            }

            c.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return users;
	}
	
	public static void deleteuser(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakanat", "root", "");
            Statement stmt = c.createStatement();
            String sql = "DELETE FROM `user` WHERE `user`.`username` = '"+name+"'";
            stmt.executeUpdate(sql);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String []args) {
		user u=null;
		u.login("Adminname","33333" );
		System.out.println(u.usertype);
		
		ArrayList<user> al=new ArrayList<user>();
		al=u.getuser();
		for (int i=0;i<5;i++) {
           System.out.println(al.get(i).getUserName());
        }
		
		
		
	}
}
