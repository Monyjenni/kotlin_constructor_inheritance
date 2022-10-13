 class Box (
    var length : Int,
    var width : Int,
    var height : Int
        )
 {
     init {
         println("Init Block Called ")
     }


    // this is secondary constructor that doesnt require value
    // giving default value to the class
     constructor(color : String = "Red"): this(0,0,0){

         println("secondary constructor ")

     }

 }