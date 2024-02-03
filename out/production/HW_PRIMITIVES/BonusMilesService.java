public class BonusMilesService {
    public int calculate(int ticketCost) {
        int milesPerRub = 20;
        return ticketCost / milesPerRub;
    }
}