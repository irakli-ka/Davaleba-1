class VIPAccount(accountNumber: String, ownerName: String) : Account(accountNumber, ownerName) {
    val transactionFee: Double = 2.0

    override fun withdraw(amount: Double) {
        val totalAmount = amount + transactionFee
        if (getBalance() >= totalAmount ) {
            super.withdraw(totalAmount)
        } else {
            println("Withdraw operation failed!")
        }
    }
}