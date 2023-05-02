package DistributesSystems.myaction.domain;

import java.io.Serializable;

import javax.persistence.OneToMany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class Campaign implements Serializable {
    
    @OneToMany
    private List<Donation> donation;
    

    
    public static void main(String[] args) {
        try {
            String name = args[0];
            Double donationMinimum = Double.parseDouble(args[1]);
            Double targetAmount = Double.parseDouble(args[2]);
            
            Status status = Status.IN_PROGRESS;
            
            



        }
        catch (Exception e) {
            System.err.println("Somethin went wrong!");
            e.printStackTrace();
        }
    }

}
