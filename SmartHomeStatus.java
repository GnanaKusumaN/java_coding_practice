
import java.util.Scanner;

/*Smart Home Device Status Report

A smart home device tracks the following data every minute:

Number of lights on in the house (byte) — max 127 lights

Number of doors locked (short) — max 32,767

Total energy consumption in watts (int)

Total energy consumption over the month in watt-hours (long)

Current temperature in Celsius (float)

Average temperature over the day (double)

Current mode of the device (char) — 'A' for Auto, 'M' for Manual, 'O' for Off

Is the security system active? (boolean)*/
public class SmartHomeStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter number of lights on (byte): ");
        byte lightsOn = sc.nextByte();

        System.out.print("Enter number of doors locked (short): ");
        short doorsLocked = sc.nextShort();

        System.out.print("Enter current energy consumption in watts (int): ");
        int currentEnergyWatts = sc.nextInt();

        System.out.print("Enter total monthly energy consumption in watt-hours (long): ");
        long monthlyEnergyWh = sc.nextLong();

        System.out.print("Enter current temperature in Celsius (float): ");
        float currentTempC = sc.nextFloat();

        System.out.print("Enter average temperature over the day (double): ");
        double avgTempDay = sc.nextDouble();

        System.out.print("Enter device mode (A=Auto, M=Manual, O=Off) (char): ");
        char deviceMode = sc.next().charAt(0);

        System.out.print("Is the security system active? (true/false) (boolean): ");
        boolean securityActive = sc.nextBoolean();

        System.out.println("\nSmart Home Status Report:");
        System.out.println("Lights On: " + lightsOn);
        System.out.println("Doors Locked: " + doorsLocked);
        System.out.println("Current Energy Consumption (W): " + currentEnergyWatts);
        System.out.println("Monthly Energy Consumption (Wh): " + monthlyEnergyWh);
        System.out.println("Current Temperature (°C): " + currentTempC);
        System.out.println("Average Temperature Today (°C): " + avgTempDay);
        System.out.println("Device Mode: " + deviceMode);
        System.out.println("Security System Active: " + securityActive);

        sc.close();

    }
    
}
