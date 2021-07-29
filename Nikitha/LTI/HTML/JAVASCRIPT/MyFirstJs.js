function Display()
{
    var num1=parseInt(document.getElementById("txtNo1").value);
    var num2=parseInt(document.getElementById("txtNo2").value);
    var result=num1+num2;
    var output="<p>"+result+"</p>";
    //document.write(result);

    document.getElementById("myDiv").innerHTML=output;
}