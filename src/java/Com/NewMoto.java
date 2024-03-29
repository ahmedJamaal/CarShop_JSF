package Com;
// Generated Jan 12, 2019 5:52:10 AM by Hibernate Tools 4.3.1



/**
 * NewMoto generated by hbm2java
 */
public class NewMoto  implements java.io.Serializable {


     private long id;
     private String name;
     private String model;
     private String type;
     private Long price;
     private Long year;
     private Long cylinder;
     private byte[] image;

    public NewMoto() {
    }

	
    public NewMoto(long id) {
        this.id = id;
    }
    public NewMoto(long id, String name, String model, String type, Long price, Long year, Long cylinder, byte[] image) {
       this.id = id;
       this.name = name;
       this.model = model;
       this.type = type;
       this.price = price;
       this.year = year;
       this.cylinder = cylinder;
       this.image = image;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Long getPrice() {
        return this.price;
    }
    
    public void setPrice(Long price) {
        this.price = price;
    }
    public Long getYear() {
        return this.year;
    }
    
    public void setYear(Long year) {
        this.year = year;
    }
    public Long getCylinder() {
        return this.cylinder;
    }
    
    public void setCylinder(Long cylinder) {
        this.cylinder = cylinder;
    }
    public byte[] getImage() {
        return this.image;
    }
    
    public void setImage(byte[] image) {
        this.image = image;
    }




}


