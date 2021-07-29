class Car
{
    model:String;
    doors:Number;
    isElectric:Boolean;

constructor(model:String,doors:Number,isElectric:Boolean)
{
    this.model=model;
    this.doors=doors;
    this.isElectric=isElectric;
}
show():void
{
    console.log("This car :" +this.model + "has" + this.doors + "and is :" +this.isElectric);
}
}
let myCar=new Car("Innova",4,false);
myCar.show();
