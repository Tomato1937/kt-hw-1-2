fun main() {
    val itemPrice: Int = 100_00;
    val itemCount: Int = 11;
    val musicLover: Boolean = true;
    var sumPurchased = 15000_00;
    var totalPrice = itemPrice * itemCount;

    if (sumPurchased in 1001_00..10000_00) {
        totalPrice -= 100_00;
    } else if (sumPurchased > 10000_00) {
        totalPrice -= (totalPrice * 0.05).toInt();
    }

    if (musicLover) {
        totalPrice -= (totalPrice * 0.01).toInt();
    }

    if (totalPrice % 100 == 0) {
        println("Сумма покупки $totalPrice руб.");
    } else {
        println("Сумма покупки " + totalPrice/100 + "руб. " + totalPrice%100 + "коп.");
    }
    sumPurchased += totalPrice;
}