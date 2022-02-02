fun main() {
    val previousAmount = 1001
    val currentAmount = 500
    val isRegularCustomer = true
    val discountPercent = 0.05
    val regularCustomerDiscount = 0.01
    val discount =
        if (previousAmount <= 1000) 0
        else if (previousAmount > 1000 && previousAmount <= 10000) 100
        else currentAmount * discountPercent
    val amountAfterDiscount = currentAmount - discount.toInt()
    val finalAmount =
        if (isRegularCustomer) amountAfterDiscount - amountAfterDiscount * regularCustomerDiscount else amountAfterDiscount
    if (isRegularCustomer) {
        if (discount == 0) {
            println(
                "Сумма Ваших предыдущих покупок: $previousAmount руб., сейчас при покупке на сумму $currentAmount руб. Вы получаете скидку " +
                        "постоянного покупателя 1%, итого к оплате $finalAmount руб."
            )
        } else {
            println(
                "Сумма Ваших предыдущих покупок: $previousAmount руб., поэтому сейчас при покупке на сумму $currentAmount руб. Вы получаете скидку $discount руб., " +
                        "плюс скидка постоянного покупателя 1%, итого к оплате $finalAmount руб."
            )
        }
    } else {
        if (discount == 0) {
            println(
                "Сумма Ваших предыдущих покупок: $previousAmount руб., сейчас к оплате $finalAmount руб. Чтобы получить скидку при следующей покупке, " +
                        "общая сумма покупок должна превысить 1000 руб."
            )
        } else {
            println(
                "Сумма Ваших предыдущих покупок: $previousAmount руб., поэтому сейчас при покупке на сумму $currentAmount руб. Вы получаете скидку $discount руб., " +
                        "итого к оплате $finalAmount руб."
            )
        }
    }
}
