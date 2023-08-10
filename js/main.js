// Llamamos a todos los objetos del HTML que utilizaremos
const costosFijosInput = document.getElementById('costosFijos');
const precioVentaInput = document.getElementById('precioVenta');
const costosVariablesInput = document.getElementById('costosVariables');
const btnCalcular = document.getElementById('btnCalcular');
const resultH2 = document.getElementById('result');
const emsg1 = document.getElementById('emsg1');
const emsg2 = document.getElementById('emsg2');
const emsg3 = document.getElementById('emsg3');

// Creamos las variables que seran utilizadas como flag 
let costosFijosValue = null;
let precioVentaValue = null;
let costosVariablesValue = null;

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
    costosFijosValue = validateInput(costosFijosInput, emsg1);
    precioVentaValue = validateInput(precioVentaInput, emsg2);
    costosVariablesValue = validateInput(costosVariablesInput, emsg3);
};

const calculate = () => {
    const result = costosFijosValue / (precioVentaValue - costosVariablesValue);
    console.log(result);
    write(resultH2, result);
};

const send= ()=> {
    validateForm();
    if (!costosFijosValue || !precioVentaValue || !costosVariablesValue) {
        return
    } else {
        calculate();
    };
};