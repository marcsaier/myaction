package DistributesSystems.myaction.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Donation {
    
    
    public static void main(String[] args) {
        try {
            
            Double amount = Double.parseDouble(args[0]);
            Boolean receiptRequest = Boolean.parseBoolean(args[1]);
            String donorName = args[2];
            

            
        }
        catch (Exception e) {
            System.err.println("Somethin went wrong!");
            e.printStackTrace();
        }
    }
}
