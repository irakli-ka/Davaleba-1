class SavingAccount(accountNumber: String, ownerName: String) : Account(accountNumber, ownerName) {
    override fun withdraw(amount: Double) {
        if (amount <= 500){
            super.withdraw(amount)
        } else {
            println("Limit for withdrawal from saving account ($accountNumber) exceeded!")
        }
    }
}

