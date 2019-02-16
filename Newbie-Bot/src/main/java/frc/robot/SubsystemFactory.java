package main.java.frc.robot;

public class SubsystemFactory{
    
    private static SubsystemFactory instance;

    private String newbieMacAddress = "00:80:2F:22:D7:BC";

    
    private SubsystemFactory()
    {

    }

    //Accessor Methods

    public static SubsystemFactory getInstance()
    {
       if(instance == null)
       {
            instance = new SubsystemFactory();
            return instance;
       }
        else
            return instance;
    }

    public void init()
    {
        initCommon();
    }
    public void initCommon()
    {
        
    }

    public void initNewbie()
    {

    }

}