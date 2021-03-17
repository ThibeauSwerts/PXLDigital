const random = Math.floor(Math.random() * 10 + 1);
let kansen = 3;

do{
    let getal = Number(prompt("Geef een getal tussen 1 en 10."));
    kansen--;
    if (!Number.isNaN(getal) && getal > 0 && getal <= 10){
        if(getal === random){
            alert("Proficiat! Het getal was " + getal);
            kansen = 0;
        }else if (kansen < 1){
            alert("Sorry, niet geraden.");
        }
    }
    else{
        console.log("Foutief getal");
    }
} while (kansen > 0);