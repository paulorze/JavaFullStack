// Llamamos a todos los objetos del HTML que utilizaremos
const edadInput = document.getElementById('edad');
const btnCalcular = document.getElementById('btnCalcular');
const result = document.getElementById('result');
const emsg1 = document.getElementById('emsg1');

// Creamos las variables que seran utilizadas como flag 
let edadValue = null;


// Creamos las funciones necesarias para validar los datos ingresados y escribir en el HTML
const write = (obj, text) => {
    obj.innerHTML = text;
};

const validateInput = (input, emsg) => {
    const value = Number(input.value);
    if (!value || value === NaN || value <= 0 || value >= 100) {
        write(emsg,"Por favor, ingrese un dato valido.");
        return null 
    } else {
        write(emsg,""); 
        return value;
    };
};

const validateForm = () => {
    edadValue = validateInput(edadInput, emsg1);
    write(result,"")
};

const calculate = () => {
    if (edadValue >= 18) {
        write(result,"Edad validada, es mayor de 18 anios.")
    } else {
        write(result,"Error, es menor de 18 anios.")
    };
};

const send= ()=> {
    validateForm();
    if (!edadValue) {
        return
    } else {
        calculate();
    };
};