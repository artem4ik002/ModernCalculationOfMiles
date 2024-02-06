public class BonusMilesService {
    public int calculate(int price) {
        
        int rublesOneMile = 20; // Количество рублей для одной бонусной мили
        return price / rublesOneMile;
    }
}






