package bonch.dev.school.Model

class ClickCounterData(startCount: Int = 0) {
    var currentCount = startCount
        private set

    fun increment(){
        currentCount++
    }
}