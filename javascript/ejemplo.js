var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var tipoA = lines.shift();
var cAnimal = lines.shift();
var subClasiA = lines.shift();


if(tipoA.trim()==='vertebrado'){
    if(cAnimal.trim()==='ave'){
        if(subClasiA.trim()==='carnivoro'){console.log("aguia");}
        else{console.log("pomba");}
    }else if(cAnimal.trim()==='mamifero'){
        if(subClasiA.trim()==='onivoro'){console.log("homem");}
        else{console.log("vaca");}
    }
}else if(tipoA.trim()==='invertebrado'){
    if(cAnimal.trim()==='inseto'){
        if(subClasiA.trim()==='hematofago'){console.log("pulga");}
        else{console.log("lagarta");}
    }else if(cAnimal.trim()==='anelideo'){
        if(subClasiA.trim()==='hematofago'){console.log("sanguessuga");}
        else{console.log("minhoca");}
    }
}



