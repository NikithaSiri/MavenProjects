var Car = /** @class */ (function () {
    function Car(model, doors, isElectric) {
        this.model = model;
        this.doors = doors;
        this.isElectric = isElectric;
    }
    Car.prototype.show = function () {
        console.log("This car :" + this.model + "has" + this.doors + "and is :" + this.isElectric);
    };
    return Car;
}());
var myCar = new Car("Innova", 4, false);
myCar.show();
