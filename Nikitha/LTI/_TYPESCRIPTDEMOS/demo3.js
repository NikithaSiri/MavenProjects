/* Javascript vs TypeScript:
   Loosely typed language
   application is not safer
   typecasting

   Typescript:
   safe
   strictly typed language

    let vs var:
   Var acts as global variable
   Let acts as local variable*/
var x = 5;
var y = 5;
var times = 5;
if (times > 3) {
    var msg = "hello"; //global
}
console.log(msg);
msg = "welcome";
console.log(msg);
x = 10;
y = 200;
var times1 = 5;
if (times1 > 3) {
    var mymsg = "World";
    console.log(mymsg); //local
}
//console.log(mymsg);  not allowed outside the block as scope is local to the block
