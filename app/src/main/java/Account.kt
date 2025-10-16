open class Account(val accountNumber: String, var ownerName : String) {

    private var balance: Double = 0.0


    fun getBalance(): Double {
        return balance
    }

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposit successful - Account : $accountNumber | Balance : ${getBalance()}")
        }
    }

    open fun withdraw(amount: Double) {
        if (amount > 0 && balance >= amount) {
            balance -= amount
            println("Withdraw successful - Account : $accountNumber | Balance : ${getBalance()}")
        } else {
            println("Withdraw operation failed!")
        }
    }

    fun printInfo() {
        println("Account: $accountNumber\nName: $ownerName\nBalance: $balance")
    }

}