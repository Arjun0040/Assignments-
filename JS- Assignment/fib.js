var num1 = 0; 
var num2 = 1; 
var num3 = 0; 
var range = 20; 
console.log(num1); 
console.log(num2); 

for(let i = 3; i < range; i++) {
    num3 = num1 + num2; 
    console.log(num3);
    num1 = num2; 
    num2 = num3;  
}