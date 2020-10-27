package First

class Exercise_2 {
    static void main(def args) {
        //Initialize marks
       	def marks = [20,40,60,80,100]
		def sum=0, avg=0
		def grade = "F"
        
        //Calculate Average
		marks.each { sum+=it }
		avg = sum/marks.size()
        
        //Get Grade
        switch(avg) {
            case 90..100:
                grade = "A"
                break
            case 80..89:
                grade = "B"
                break
            case 70..79:
                grade = "C"
                break
            case 50..69:
                grade = "D"
                break
            case 0..49:
                grade = "F"
                break
            default:
                println "Invalid value"
        }
        
        //Print results
        println marks.max()
        println marks.min()
        println avg
        println grade
    }
}
