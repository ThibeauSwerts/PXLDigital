const power = (base, exponent) => {
    let result = 1;
    for (let i = 0; i< exponent; i++){
        result *= base;
    }
    return result
}
console.log(power(2,3));

const square = (x) =>{return x*x;};
console.log(square(3))
//kan ook geschreven worden als
const square2 = x => x*x;
console.log(square2(3))