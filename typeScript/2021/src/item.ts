//===================== Promesas  ====================
interface Xmen {
  nombre: String;
  edad: number;
  poder?: String; //default atribute
}

const enviarMision = (xmen: Xmen) => {
  console.log(`Enviando a ${xmen.nombre} con poder de ${xmen.poder}`);
  console.log(`Enviando a ${xmen.nombre} con poder de ${xmen.poder}`);
  if (true) {
    console.log(`Enviando a ${xmen.nombre} con poder de ${xmen.poder}`);
  }
  console.log(`Enviando a ${xmen.nombre} con poder de ${xmen.poder}`);
  console.log(`Enviando a ${xmen.nombre} con poder de ${xmen.poder}`);
  console.log(`Enviando a ${xmen.nombre} con poder de ${xmen.poder}`);
};

const regresarMision = (xmen: Xmen) => {
  console.log(`${xmen.nombre} regreso al cuartel`);
};

const Batman = {
  nombre: "Bruce",
  edad: 60,
};

const Superman = {
  nombre: "Clark",
  edad: 45,
};

const Spiderman = {
  nombre: "peter",
  edad: 25,
  poder: "trepar paredes",
};

enviarMision(Spiderman);

//enviarMision( Batman );
//regresarMision( Superman );