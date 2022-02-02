fun main() {
    val amount: Int = 100_00;
    val taxMin: Int = 35_00;
    val totalTax: Int = if (amount * 0.0075 >= taxMin) (amount * 0.000075).toInt() else taxMin/100;
    println("Total Tax: $totalTax руб.");
}