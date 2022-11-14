import jakarta.persistence.Table;

@Entity
@Table(name = "flight")
 
//POJO class
public class flight {
 
    @Id 
    @Column(name = "flightId")
    private int id;
 
    @Column(name = "flightName")
    private String flightName;
 
    @Column(name = "carrierName") 
    private String carrierName;
 
    public int getId()
    { 
    	return id; 
    }
 
    public void setId(int id)
    { 
    	this.id = id;
    }
 
    public String getflightName() 
    {
    	return flightName; 
    }
 
    public void setflightName(String flightName)
    {
        this.flightName = flightName;
    }
 
    public String getcarrierName() 
    { 
    	return carrierName;
    }
 
    public void setcarrierName(String carrierName)
    {
        this.carrierName = carrierName;
    }
}