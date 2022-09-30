

object InsertionSortExample {
def insertionSort (A: Array[Integer]): Array[Integer]= {
    for ( j <- 1 until A.length ) {
        var key = A(j)
        var i = j - 1
        while(i > 0 && A(i) > key){
             A(i+1)=A(i)
             i = i - 1
            
        }
         A(i+1) = key
    }
    return A
}

def main(args: Array[String]): Unit = {

    // var A = new Array[Integer](6)
    // A = 
    var B = insertionSort(Array(2,7,64,5,12,11))
    for(i <- 0 until B.length){
        println(B(i))
    }
    
}
}