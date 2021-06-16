fun main() {

//Question 1a

    var c: String = "Temitope"
    var d: String = "Leslie Okah"

    if(c.length > d.length) {
        println("$c is longer than $d")
    }else{
        println("$c is not longer than $d")
    }


    var a: Int= 12
    var b: Int = 18
    if(a>b) {
        println("$a is greater than $b")
    }else{
        println("$a is not greater than $b")
    }

    if(a>c.length) {
        println("$a is greater than the number of alphabets in $c")
    }else{
        println("$a is not greater than the number of alphabets in $c")
    }

//Question 1b
    var fNum = Math.random()*100

    println(fNum.toInt())

    when (fNum.toInt()) {
        1 -> println("Today is Monday")
        2 -> println("Today is Tuesday")
        3 -> println("Today is Wednesday")
        4 -> println("Today is Thursday")
        5 -> println("Today is Friday")
        6 -> println("Today is Saturday")
        7 -> println("Today is Sunday")
        else -> {
            println("Enter a valid day")
        }
    }
//Question 2a
    for (i in 1..100) {
        println(i)
    }


    for (n in 1..10){
        if(n==4||n==5)
            continue
        println(n)
    }
//Question 2b
    for (n in 1..10){
        if(n==4||n==5)
            continue
        println(n)
    }


    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j} ")
        }
        println()
    }

//Question 3
    for (i in 1..2) {
        for (j in 10..20) {
            print("${j} ")
        }
        for (k in 21..30) {
            print("${k} ")
        }
        println()
    }
// Solution
    for (i in 10..30) {
        if(i <=20){
            if(i%2==0){
                println(i)}
        } else if (i >= 20) {
            if(i%2==1){
                println(i)}
        }

    }


    var user1:User = User("felix",32,'m',450353.04)

    user1.user()

    var team1: Football = Football("Chelsea", "Thomas Tuchel", 49017967,"Stamford Bridge")
    team1.aTeam()

    var client1:Tailor = Tailor("ankara", "senator", 39, 12000, "2 Weeks")
    client1.order()

    var rider1: Dispatch = Dispatch("Sunny", "3902Bfe", "Home Theater", 14,9700, "Nnebisi")
    rider1.confirm()

    var staff1:Employee = Employee("lloyd", "James", 24,'m',43200.98,"Admin")
    staff1.staff()

}

    //Question 4
    class User {
       private var name: String = ""
        var age: Int = 0
        var sex: Char = 'f'
        var salary: Double = 0.0

        constructor(name: String, age: Int, sex: Char, salary: Double) {
            this.name = name
            this.age = age
            this.sex = sex
            this.salary = salary
        }

        fun getUser() {
            return this.name
        }

        fun setUser(name: String

        ) {
            this.name = name
        }

        fun user() {
            println("Hello $name, you are a $age year(s) old $sex earning N$salary, Right?")
        }

    }




        class Football {
           private var team: String = ""
            var coach: String = ""
            var fans: Int = 0
            var stadium: String = ""

            constructor(team: String, coach: String, fans: Int, stadium: String) {
                this.team = team
                this.coach = coach
                this.fans = fans
                this.stadium = stadium
            }

            fun getTeam() {
                return this.team

            }

            fun setTeam(team: String

            ) {
                this.team = team
            }

            fun aTeam() {
                println("This is the $team Football team, our coach is $coach. We have about $fans fans and the name of our stadium is $stadium")
            }
        }


            class Tailor {
               private var fabric: String = ""
                var style: String = ""
                var size: Int = 0
                var amount: Int = 0
                var dueDate: String = ""

                constructor(
                    fabric: String,
                    style: String,
                    size: Int,
                    amount: Int,
                    dueDate: String
                ) {
                    this.fabric = fabric
                    this.style = style
                    this.size = size
                    this.amount = amount
                    this.dueDate = dueDate
                }

                fun getTailor() {
                    return this.fabric

                }

                fun setTailor(fabric: String

                ) {
                    this.fabric = fabric
                }

                fun finished() {
                    println("Your order has been received; fabric: $fabric, style: $style, size: $size, amount: $dueDate")

                }


                fun order() {
                    println("Yes!, we have your order. We will design $style dress of size $size using $fabric fabric. This will cost N$amount and will be ready by $dueDate")
                }

            }


                class Dispatch {
                    private var rider: String = ""
                    var bikeNo: String = ""
                    var package1: String = ""
                    var size: Int = 0
                    var amount: Int = 0
                    var destination: String = ""

                    constructor(
                        rider: String,
                        bikeNo: String,
                        package1: String,
                        size: Int,
                        amount: Int,
                        destination: String
                    ) {
                        this.rider = rider
                        this.bikeNo = bikeNo
                        this.package1 = package1
                        this.size = size
                        this.amount = amount
                        this.destination = destination
                    }

                    fun getDispatch() {
                        return this.rider

                    }

                    fun setDispatch(rider: String

                    ) {
                        this.rider = rider
                    }

                    fun confirm() {
                        println("Hello, our dispatch rider $rider, with bike number $bikeNo has your package of $sizeKg, to be delivered at $destination. This service will cost $amount.")
                    }
                }


                    class Employee {
                        private  var fname: String = ""
                        private var lname: String = ""
                        var age:Int = 0
                        var sex: Char = ''
                        var salary: Double = 0.0
                        var position: String = ""

                        constructor(fname: String,
                                    lname: String,
                                    age:Int,
                                    sex: Char,
                                    salary: Double,
                                    position: String) {
                            this.fname = fname
                            this.lname = lname
                            this.age = age
                            this.sex = sex
                            this.salary = salary
                            this.position = position
                        }

                        fun staff() {
                            println("Hello $fname $lname, you stated you are $age years old and your gender as $sex. We will be offering you N$salary monthly for the position of $position.")
                        }

                        fun getStaff() {
                            return this.fname
                            this.lname

                        }

                        fun setStaff(fname: String,
                                     lname: String
                        ) {
                            this.fname = fname
                            this.lname = lname
                        }

                    }
