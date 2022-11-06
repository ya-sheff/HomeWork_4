import org.junit.Assert.assertEquals
import org.junit.Test

class DifferentCommision2KtTest {

    @Test
    fun typeCardSumma1() {
        val transferAmount = 75001
        val typeCard = "Mastercard"
        val summaLastTransfer = 0
        val comissionMM = 0.6
        val minComissionMM = 20
        val masterMaestro = (((transferAmount * comissionMM) / 100) + transferAmount) + minComissionMM
        val res = if (typeCard == "Mastercard" && transferAmount > 75000) masterMaestro
        else transferAmount

        val result = typeCardSumma(transferAmount = transferAmount, typeCard = typeCard, summaLastTransfer = summaLastTransfer)

        assertEquals(75471.006, res)
    }

    @Test
    fun typeCardSumma2() {
        val transferAmount = 75001
        val typeCard = "Maestro"
        val summaLastTransfer = 0
        val comissionMM = 0.6
        val minComissionMM = 20
        val masterMaestro = (((transferAmount * comissionMM) / 100) + transferAmount) + minComissionMM
        val res = if (typeCard == "Maestro" && transferAmount > 75000) masterMaestro
        else transferAmount

        val result = typeCardSumma(transferAmount = transferAmount, typeCard = typeCard, summaLastTransfer = summaLastTransfer)

        assertEquals(75471.006, res)
    }

    @Test
    fun typeCardSumma3() {
        val transferAmount = 75001
        val typeCard = "Visa"
        val summaLastTransfer = 0
        val comissionVM = 0.75
        val minComissionVM = 35
        val visaMir = ((transferAmount * comissionVM) / 100)
        val res2 = if (visaMir < minComissionVM) transferAmount + minComissionVM else transferAmount + visaMir

        val result = typeCardSumma(transferAmount = transferAmount, typeCard = typeCard, summaLastTransfer = summaLastTransfer)

        assertEquals(75563.5075, res2)
    }

    @Test
    fun typeCardSumma4() {
        val transferAmount = 75001
        val typeCard = "Мир"
        val summaLastTransfer = 0
        val comissionVM = 0.75
        val minComissionVM = 35
        val visaMir = ((transferAmount * comissionVM) / 100)
        val res2 = if (visaMir < minComissionVM) transferAmount + minComissionVM else transferAmount + visaMir

        val result = typeCardSumma(transferAmount = transferAmount, typeCard = typeCard, summaLastTransfer = summaLastTransfer)

        assertEquals(75563.5075, res2)
    }

    @Test
    fun typeCardSumma5() {
        val transferAmount = 75001
        val typeCard = "VK pay"
        val summaLastTransfer = 0
        val res3 = transferAmount

        val result = typeCardSumma(transferAmount = transferAmount, typeCard = typeCard, summaLastTransfer = summaLastTransfer)

        assertEquals(75001, res3)
    }

    @Test
    fun main() {
        val transferAmount = 75001
        val typeCard = "Maestro"
        val summaLastTransfer = 0
        val comissionMM = 0.6
        val minComissionMM = 20
        val masterMaestro = (((transferAmount * comissionMM) / 100) + transferAmount) + minComissionMM
        val res = if (typeCard == "Maestro" && transferAmount > 75000) masterMaestro
        else transferAmount

        val result = typeCardSumma(transferAmount = transferAmount, typeCard = typeCard, summaLastTransfer = summaLastTransfer)

        assertEquals(75471.006, res)
    }

}