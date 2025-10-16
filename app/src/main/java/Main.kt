

fun main() {

    val acc1 = SavingAccount("S101", "giorgi g.")
    val acc2 = VIPAccount("V202", "mariami a.")

    acc1.deposit(1000.0)
    acc1.withdraw(300.0)
    acc1.withdraw(600.0)

    acc2.deposit(1000.0)
    acc2.withdraw(50.0)
    acc2.printInfo()

    val accounts: List<Account> = listOf(acc1, acc2)

    for (account in accounts) {
        account.deposit(50.0)
        account.printInfo()
    }
}