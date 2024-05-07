import java.math.BigDecimal

fun main(){

    val float1 = 0.1f;
    var total1 = 0.0f;
    val double1 = 0.1;
    var total2 = 0.0;
    val float2 = 0.1f;
    val total3 = 0.0f;
    val float2D = float2.toBigDecimal();
    var total3D = total3.toBigDecimal();

    println("BigDouble")
    for(i in 0..9){

        total3D += float2D;
        println(total3D);

    }//end for
    println("Float")
    for(i in 0..9){

        total1 += float1;
        println(total1);

    }//end for
    println("Double")
    for(i in 0..9){

        total2 += double1;
        println(total2);

    }//end for

}//end main