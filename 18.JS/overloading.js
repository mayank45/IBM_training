function add(){
    console.log(arguments);
    var sum = 0;
    for(var i=0;i<arguments.length;i++){
        if(!isNaN(+arguments[i]))
        sum += +arguments[i];
    }
    return sum;
}

add(3,5)
add(5,7,2,5)