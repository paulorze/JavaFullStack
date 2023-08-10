// Llamamos a todos los objetos del HTML que utilizaremos
const usernameInput = document.getElementById('username');
const passwordInput = document.getElementById('password');
const btnLogin = document.getElementById('btnLogin');
const result = document.getElementById('result');

// Creamos las variables correspondientes a las credenciales
const usernameDB = 'admin';
const passwordDB = '1234';

// Creamos las variables que seran utilizadas como flag
let usernameValid = false;
let passwordValid = false;


// Creamos las funciones necesarias para validar los datos ingresados y escribir en el HTML
const write = (obj, text) => {
    obj.innerHTML = text;
};

const validateInput = (input, flag) => {
    const value = input.value;
    if (!value || value !== flag) {
        return false 
    } else {
        return true;
    };
};

const validateForm = () => {
    usernameValid = validateInput(usernameInput, usernameDB);
    passwordValid = validateInput(passwordInput, passwordDB);
};

const send= ()=> {
    validateForm();
    if (!usernameValid || !passwordValid) {
        write(result, "Username o password invalidos")
        return
    } else {
        write(result, "Bienvenido de nuevo usuario")
    };
};