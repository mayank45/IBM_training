var obj = {

    // "name": "arun",
    // "show": function(){
    //     console.log("show my details")
    // },

    "add": function(a, b){
        return a+b;
    },
    
    "div": function(a, b){
        return a/b;
    },
    
    "mul":function(a, b){
        return a*b;
    },
    
    "sub": function(a, b){
        return a-b;
    }
}

var calculate = function(){

    var fn = document.getElementById('fn').value;
    var sn = document.getElementById('sn').value;
    var operand = document.getElementById("operand").value;

    console.log(fn);
    console.log(sn);
    console.log(operand);


    // obj["add"] === obj.add
    var output = obj[operand](+fn, +sn);
    document.getElementById('result').innerText = output;
    
}

document.getElementById('btn').addEventListener('click', calculate)




