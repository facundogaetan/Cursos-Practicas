function adjustNumber(rangeStart, rangeEnd, numberToRound){
    // chequeamos que sean numeros
    if((typeof(rangeStart) === 'number') && (typeof(rangeEnd) === 'number') && (typeof(numberToRound) === 'number')) {
        console.log("Son numeros");
            //los 3 parametros tienen que ser diferentes
            if((rangeStart === rangeEnd) || (rangeStart === numberToRound) || (numberToRound === rangeEnd)) {
                console.log("Dos o mas de los parametros son iguales");
            //si los 3 parametros son diferentes entonces:
            } else {
                if(Math.abs(rangeStart - numberToRound) < Math.abs(rangeEnd - numberToRound)) {
                    console.log(numberToRound + " Es mas cercano a " + rangeStart + " que " + rangeEnd);
                } else {
                    console.log(numberToRound + " Es mas cercano a " + rangeEnd + " que " + rangeStart);
                }
            }
    } else {
        //si no son numeros veremos el error por consola
        console.log("Uno o mas de los parametros no son numeros");
    }
}

//rangeStart, rangeEnd, numberToRound
adjustNumber(-100,-50,1);