package sakanat;

import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class house {
	
	private String title=null;
	private String location=null;
	private String description=null;
	private Double price;
	private owner house_owner=null;
	private tanent house_tanent=null;
	private String contact_information=null;
	private List<BufferedImage> images = new ArrayList<BufferedImage>();
	
	private String owner_name=house_owner.getUserName();
	private String tanent_name=house_tanent.getUserName();
	
	//constructors
	public house() {
		
	}
	public house(String title , owner ownername) {
		this.title=title;
		this.house_owner=ownername;
	}
	
	
	
	
	// Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double d) {
        this.price = d;
    }

    public void setHouseOwner(owner ownerName) {
        this.house_owner = ownerName;
    }

    public void setHouseTanent(tanent tanentName) {
        this.house_tanent = tanentName;
    }

    public void setContactInformation(String contactInformation) {
        this.contact_information = contactInformation;
    }

    public void setImages(List<BufferedImage> images) {
        this.images = images;
    }
    public void setOwnerName(String ownername) {
    	this.owner_name = ownername;
    }
    public void setTanentName(String tanentname) {
    	this.tanent_name=tanentname;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public owner getOwnerName() {
        return house_owner;
    }

    public tanent getTanentName() {
        return house_tanent;
    }

    public String getContactInformation() {
        return contact_information;
    }

    public List<BufferedImage> getImages() {
        return images;
    }
    
	public static house gethouse(String title){
		house h = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakanat", "root", "");
			Statement stmt =c.createStatement();
			String sql="Select * from house where title='"+title+"'";
			ResultSet rs =stmt.executeQuery(sql);
			if(rs.next()) {
				
				h.title               = rs.getString("title");
				h.location            = rs.getString("location");
				h.owner_name          = rs.getString("owner");
				h.price               = Double.parseDouble(rs.getString("price"));
				h.tanent_name         = rs.getString("tanent");
				h.description         = rs.getString("description");
				h.contact_information = rs.getString("contact_information");
			}
			
			c.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return h;
	}
	 
	public static void addhouse(house h) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakanat", "root", "");
			Statement stmt=c.createStatement();
			String sql="INSERT INTO `houses` (`title`, `location`, `price`, `owner`, `tanent`, `contact_information`)" 
			         + "values('"+h.getTitle() +"','"+ h.getLocation() +"','"+ h.getPrice().toString() +"','"+ h.getOwnerName() +"','"+ h.getTanentName()
			         +"','"+h.getContactInformation()+"');"; 
			stmt.executeUpdate(sql);
			
			c.close();

            
	    }catch(Exception e){
			System.out.println(e);}
	}
	
	public static void deletehouse(String title) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakanat", "root", "");
            Statement stmt = c.createStatement();
            String sql = "DELETE FROM `houses` WHERE `houses`.`title` = '"+title+"'";
            stmt.executeUpdate(sql);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
