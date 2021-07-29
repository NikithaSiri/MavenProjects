export class Product{
    productId:number=0;
    prdName:string="";
    price:number=0;

    constructor(productId:number,prdName:string,price:number)
    {
        this.productId=productId;
        this.prdName=prdName;
        this.price=price;
    }
}