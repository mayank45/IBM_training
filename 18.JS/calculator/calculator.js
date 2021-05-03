
/* document.getElementById('moreBtn').addEventListener('click', function(){
    console.log("new element")
    var input = document.createElement('input');
    input.setAttribute("name", "num");
    input.setAttribute("value", "0");
    input.setAttribute("type", "number");
    
    document.getElementById('numbers').append(input)
    document.getElementById('numbers').append(document.createElement('br'))

}) */


document.getElementById('moreBtn').addEventListener('click', function(){
    console.log("new element")
    var input = '<input name="num" value="0" type="number" /><br/>';
    
    console.log(input);

    document.getElementById('numbers').innerHTML += input;

})


document.getElementById("addBtn").addEventListener('click', function(){
    var inputs = document.getElementsByName('num');

    var result = 0;
    for(var i=0;i<inputs.length;i++){
        result += +inputs[i].value;
    }

    document.getElementById('result').innerText = "Result is "+result;
    
})