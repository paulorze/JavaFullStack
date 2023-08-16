// Llamamos a todos los objetos del HTML que utilizaremos
const eneroIngreso = document.getElementById('eneroIngreso');
const eneroEgreso = document.getElementById('eneroEgreso');
const febreroIngreso = document.getElementById('febreroIngreso');
const febreroEgreso = document.getElementById('febreroEgreso');
const marzoIngreso = document.getElementById('marzoIngreso');
const marzoEgreso = document.getElementById('marzoEgreso');
const abrilIngreso = document.getElementById('abrilIngreso');
const abrilEgreso = document.getElementById('abrilEgreso');
const mayoIngreso = document.getElementById('mayoIngreso');
const mayoEgreso = document.getElementById('mayoEgreso');
const junioIngreso = document.getElementById('junioIngreso');
const junioEgreso = document.getElementById('junioEgreso');
const julioIngreso = document.getElementById('julioIngreso');
const julioEgreso = document.getElementById('julioEgreso');
const agostoIngreso = document.getElementById('agostoIngreso');
const agostoEgreso = document.getElementById('agostoEgreso');
const septiembreIngreso = document.getElementById('septiembreIngreso');
const septiembreEgreso = document.getElementById('septiembreEgreso');
const octubreIngreso = document.getElementById('octubreIngreso');
const octubreEgreso = document.getElementById('octubreEgreso');
const noviembreIngreso = document.getElementById('noviembreIngreso');
const noviembreEgreso = document.getElementById('noviembreEgreso');
const diciembreIngreso = document.getElementById('diciembreIngreso');
const diciembreEgreso = document.getElementById('diciembreEgreso');
const resultado = document.getElementById('resultado');
const errorMSG = document.getElementById('errorMSG')
const btn = document.getElementById('btn')

const ingresos = [eneroIngreso, febreroIngreso, marzoIngreso, abrilIngreso, mayoIngreso, junioIngreso, julioIngreso, agostoIngreso, septiembreIngreso, octubreIngreso, noviembreIngreso, diciembreIngreso];
const egresos = [eneroEgreso, febreroEgreso, marzoEgreso, abrilEgreso, mayoEgreso, junioEgreso, julioEgreso, agostoEgreso, septiembreEgreso, octubreEgreso, noviembreEgreso, diciembreEgreso];

// Creamos las variables que seran utilizadas como flag
let ingresosValid = false;
let egresosValid = false;


// Creamos las funciones necesarias para validar los datos ingresados y escribir en el HTML
const write = (obj, text) => {
    obj.innerHTML = text;
};

const validateInput = (element) => {
    const value = +element.textContent;
    if (!value || value === NaN || value <=0 ) {
        element.classList.remove('valid')
        element.classList.add('error');
        return false
    } else {
        element.classList.remove('error');
        element.classList.add('valid');
        return true
    };
};

const validateData = () => {
    ingresosValid = true;
    egresosValid = true;
    ingresos.forEach(elemento => {
        const validacion = validateInput(elemento)
        if (ingresosValid === true && !validacion) {
            ingresosValid = false;
        };
    });
    egresos.forEach(elemento => {
        const validacion = validateInput(elemento)
        if(egresosValid === true && !validacion) {
            egresosValid = false;
        };
    });
};

const calcularFlujoDeCaja = () => {
    let totalIngresos = 0;
    let totalEgresos = 0;
    ingresos.forEach(elemento => {
        totalIngresos += +elemento.textContent
    });
    egresos.forEach(elemento => {
        totalEgresos += +elemento.textContent
    });
    return totalIngresos - totalEgresos;
};

const toggleClass = (num) => {
    if (num > 0) {
        resultado.classList.add('positivo');
        resultado.classList.remove('neutro');
        resultado.classList.remove('negativo');
    } else if (num === 0) {
        resultado.classList.add('neutro');
        resultado.classList.remove('positivo');
        resultado.classList.remove('negativo');
    } else {
        resultado.classList.add('negativo');
        resultado.classList.remove('neutro');
        resultado.classList.remove('positivo');
    };
};

const calcular= ()=> {
    validateData();
    if (!ingresosValid || !egresosValid) {
        write(errorMSG, 'Por favor, verifique los datos ingresados.')
    } else {
        const flujoDeCaja = calcularFlujoDeCaja();
        toggleClass(flujoDeCaja);
        write(resultado, flujoDeCaja);
    }
};