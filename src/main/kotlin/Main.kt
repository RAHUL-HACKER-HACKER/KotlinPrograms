import java.util.Scanner

//another way to declare main
//fun main() {
//
//    println("Hello World!")
//
//}
fun main(args: Array<String>) {
    //type of print
    //print(var1)
    //print(var1+var2)
    //print("name: $var1")
    //print("name: ${var1+var2}")
    //println()
    //println(var1)
    //println(var1+var1)


    //dynamic type variable(read and write)
//    var roll=100
//    println(roll)

    //Specific type variable note:always use wrapper class
//    var roll2:Int =200
//    println(roll2)
//
//    //value(only read)
//    val name="rahul"
//    println(name)
//
//    //range use a..b
//    val a=2
//    val b=5
//    for (i in a..b){
//        println(i)
//    }
//
//    //input
//    var input1= readln()
//    var intput2:String? = readLine()
//    val input3= readLine()
//    val intvalue1= readLine()!!.toInt()
//    val intvalue2= readLine()?.toInt()
//
//    var sc=Scanner(System.`in`)
//    var str1=sc.next()
//    var int1=sc.nextInt()


//    var  n= 900
//    var m=200
//    var maximum=if (n>m) n else m
//    println(maximum)

//    var n=200
//    var m=400
//    var maximum=0
//    if(n>m){
//        maximum=n
//    }else{
//        maximum=m
//    }
//    println(maximum)

//    var x=1
//    when(x){
//        1,2-> {
//            //multiple statement
//            println("One or two")
//        }
//        3-> println("Three")
//        4-> println("Four")
//        5-> println("Five")
//        else-> println("not valid")
//
//    }

//    for(item in 1..5) println(item)
//    for(item:Int in 1..5) println(item)

    //lambda expression
//    val add={a:Int,b:Int-> a+b}
//    println(add(100,300))

    //another lambda expression
//    val sum:(Int,Int)-> Int={a,b ->a+b}
//    println(sum(100,200))

    //Anonymous function1
//    val disp1=fun(a:String){
//        println("hello $a")
//    }
//    disp1("Rahul")


    //Anonymous function2
//    val disp2=fun(){
//        println("hello")
//    }
//    disp2()

    //Anonymous function3
//    val disp3=fun():Int{
//        return 100
//    }
//    println(disp3())

    //null safety(?)
//    var name1:String="rahul";
    //name1=null //not allowed

//    var name2:String?="kumar"
    //name2=null //null allowed

//    var name3:String?=null
//    println(name3?.length)

    //not null assertion operator(!!)
//    var name4:String?=null
//    println(name3!!.length)//allow to throw an exception

    //arrayOf()
//    var data1= arrayOf("Rahul","Kumar",100)
//    println(data1)

    //same data type arrayOf()
//    var data2= arrayOf<String>("Abc","pnc")
//    println(data2)
    //set value of array
//    data2[0]="add"
//    data2.set(0,"core")

    //get value of array
//    var value1=data2[0]
//    var value2=data2.get(0)

    //size of array
//    val len=data2.size
//    println(len)

    //print all elements forEach
//    data2.forEach{value-> println(value) }

    //Array constructor
//    var arr1=Array(5,{i->i*5})
//    for(item in arr1) println(item)

    //direct input in array
//    println("enter array size:")
//    val n= readLine()!!.toInt()
//    val arr2=Array(n){ readLine()!! }

    //listOf
    var list1=listOf("sonam","rahul",100)
    println(list1)

    //list elements access
    println(list1.get(0))
    println(list1[0])

    //mutableListOf()
    var list2= mutableListOf("sonam","rahul",100)
    //add()
    list2.add("kumar")
    //removeAt()
    list2.removeAt(0)
    println(list2)

    //setOf()
    var set1=setOf("rahul","kumar","rahul")
    println(set1)

    //mutableSetOf()
    var set2= mutableSetOf("sonam","rahul",100)
    //add()
    set2.add("lo add ke diya")
    //remove
    set2.remove("sonam")
    println(set2)

    //mapOf()
    var map1= mapOf(1 to "rahul",2 to "kumar","name" to "subham")
    println(map1)
    println(map1.keys)
    println(map1.values)

    //mutableMapOf()
    var map2= mutableMapOf("key1" to "value1","key2" to "value2")
    println(map2)
    // add value
    map2["key3"]="lo add kr diya"
    map2.put("key4","lo ek or add kr diya")
    //remove
    map2.remove("key1")
    map2.keys.remove("key1")
    map2.values.remove("value2")
    println(map2)













    





}