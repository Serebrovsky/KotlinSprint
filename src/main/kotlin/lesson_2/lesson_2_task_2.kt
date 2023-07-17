package lesson_2
fun main() {
    val worker: Int = 50
    val workerPay: Int = 30000

    val trainee: Int = 30
    val traineePay = 20000

//1) Расходы на выплату зарплаты постоянных сотрудников:

    val sumWorker = worker * workerPay
    println(sumWorker)

//2) Общие расходы по ЗП после прихода стажеров:
    val sumTrainee = trainee * traineePay

    val sumPay = sumTrainee + sumWorker
    println(sumPay)

//3) Среднюю ЗП одного сотрудника после устройства стажеров:
    val srednPay = sumPay / (worker + trainee)
    println(srednPay)
}