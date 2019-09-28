package Com;
// Generated Jan 12, 2019 5:52:10 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Blog generated by hbm2java
 */
public class Blog  implements java.io.Serializable {


     private long id;
     private Users users;
     private String tittle;
     private String decscrtion;
     private byte[] image;
     private Date publishDate;

    public Blog() {
    }

	
    public Blog(long id) {
        this.id = id;
    }
    public Blog(long id, Users users, String tittle, String decscrtion, byte[] image, Date publishDate) {
       this.id = id;
       this.users = users;
       this.tittle = tittle;
       this.decscrtion = decscrtion;
       this.image = image;
       this.publishDate = publishDate;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public String getTittle() {
        return this.tittle;
    }
    
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public String getDecscrtion() {
        return this.decscrtion;
    }
    
    public void setDecscrtion(String decscrtion) {
        this.decscrtion = decscrtion;
    }
    public byte[] getImage() {
        return this.image;
    }
    
    public void setImage(byte[] image) {
        this.image = image;
    }
    public Date getPublishDate() {
        return this.publishDate;
    }
    
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }




}

