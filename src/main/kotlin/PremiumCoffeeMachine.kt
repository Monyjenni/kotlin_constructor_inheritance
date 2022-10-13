// to create new
class PremiumCoffeeMachine(
    price : Double ,
    color : String
):BaseCoffeeMachine(price,color) {

    fun makeCoffee1 (){
        makeCoffee()
    }

    fun makeMatcha (){
        println("Here is your Matcha Latte ")
    }


}
