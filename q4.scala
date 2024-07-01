object demo extends App{
    var mylist=List(2,56,89,5,70,88)
    var sum=0
    for(i <- 0 until mylist.length)
    {
        if(mylist(i)%2==0)
        {
           sum=sum+mylist(i)
        }
    }
    println("The sum is "+sum)

    

}