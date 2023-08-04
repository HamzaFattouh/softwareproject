package sakanat;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class house {
	
	private String title=null;
	private String location=null;
	private String description=null;
	private float price;
	private owner owner_name=null;
	private tanent tanent_name=null;
	private String contact_information=null;
	private List<BufferedImage> images = new ArrayList<BufferedImage>();
	
	
	public house(String title , owner ownername) {
		this.title=title;
		this.owner_name=ownername;
	}
	
	
}
