// Llamamos a todos los objetos del HTML que utilizaremos
const ingresosInput = document.getElementById('ingresos');
const btnCalcular = document.getElementById('btnCalcular');
const gastosNecesarios = document.getElementById('gastosNecesarios');
const gastosOpcionales = document.getElementById('gastosOpcionales');
const ahorrosInversion = document.getElementById('ahorrosInversion');
const emsg1 = document.getElementById('emsg1');

// Creamos las variables que seran utilizadas como flag 
let ingresosValue = null;
let gastosNecesariosValue = null;
let gastosOpcionalesValue = null;
let ahorrosInversionValue = null;

// Creamos las funciones necesarias para validar los datos ingresados y escribir en el HTML
const write = (obj, text) => {
    obj.innerHTML = text;
};

const validateInput = (input, emsg) => {
    const value = Number(input.value);
    if (!value || value === NaN) {
        write(emsg,"Por favor, ingrese un dato valido.");
        return null 
    } else {
        write(emsg,""); 
        return value;
    };
};

const validateForm = () => {
    ingresosValue = validateInput(ingresosInput, emsg1);
};

const calculate = () => {
    gastosNecesariosValue = ingresosValue * 0.5;
    gastosOpcionalesValue = ingresosValue * 0.3;
    ahorrosInversionValue = ingresosValue * 0.2;
};

const send= ()=> {
    validateForm();
    if (!ingresosValue) {
        return
    } else {
        calculate();
        write(gastosNecesarios,"$ " + gastosNecesariosValue);
        write(gastosOpcionales,"$ " +  gastosOpcionalesValue);
        write(ahorrosInversion,"$ " +  ahorrosInversionValue);
    };
};