package Day7;

public class Battery {
    public static void main(String[] args) {
        
        int initialBattery = 10;
        int FullBattery = 100;
        int timeToCharge = 0;
        int currentBattery = initialBattery;
    
        while(currentBattery < FullBattery ){
            timeToCharge++;
            currentBattery = currentBattery+10;
        }

        System.out.println("Total time to charge: "+ timeToCharge+" mins");
        System.out.println("Total Battery: "+ currentBattery+"%");
    }


}
