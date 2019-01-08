
package entity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class calenderFormate {
    private String birthDate;

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    
    public void save(){
        
        System.out.println("Birth Date: "+ birthDate);
        
    }
    
}
