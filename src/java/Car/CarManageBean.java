/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

import Com.NewCar;
import Com.UsedCar;
import java.util.ArrayList;

/**
 *
 * @author Ahmed
 */
public class CarManageBean {

    private NewCar newcar;
    private UsedCar usedcar;
    private ArrayList<NewCar> newlist;
    private ArrayList<UsedCar> usedlist;
    private String Massage="";
    private CarHandler handler;
    
    public CarManageBean() {
        newcar=new NewCar();
        usedcar=new UsedCar();
        newlist=new ArrayList<>();
        usedlist=new ArrayList<>();
        handler=new CarHandler();
        
    }
    
    public String SaveNewCar()
    {
       handler.AddNewCar(newcar);
       
        return null;
    }
    public void SaveUsedCar()
    {
        
        
    }
    public void DeleteNewCar()
    {
        
        
    }
    public void DeleteUsedCar()
    {
        
        
    }
    
     public void EditNewCar()
    {
        
        
    }
    public void EditUsedCar()
    {
        
        
    }
     public void ViewNewCar()
    {
        
        
    }
    public void ViewUsedCar()
    {
        
        
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////
    public NewCar getNewcar() {
        return newcar;
    }

    public void setNewcar(NewCar newcar) {
        this.newcar = newcar;
    }

    public UsedCar getUsedcar() {
        return usedcar;
    }

    public void setUsedcar(UsedCar usedcar) {
        this.usedcar = usedcar;
    }

    public ArrayList<NewCar> getNewlist() {
        return newlist;
    }

    public void setNewlist(ArrayList<NewCar> newlist) {
        this.newlist = newlist;
    }

    public ArrayList<UsedCar> getUsedlist() {
        return usedlist;
    }

    public void setUsedlist(ArrayList<UsedCar> usedlist) {
        this.usedlist = usedlist;
    }

    public String getMassage() {
        return Massage;
    }

    public void setMassage(String Massage) {
        this.Massage = Massage;
    }

    public CarHandler getHandler() {
        return handler;
    }

    public void setHandler(CarHandler handler) {
        this.handler = handler;
    }
    
}
