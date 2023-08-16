// Llamamos a todos los objetos del HTML que utilizaremos
const capital1 = document.getElementById('capital1');
const interes1 = document.getElementById('interes1');
const resultante1 = document.getElementById('resultante1');
const capital2 = document.getElementById('capital2');
const interes2 = document.getElementById('interes2');
const resultante2 = document.getElementById('resultante2');
const capital3 = document.getElementById('capital3');
const interes3 = document.getElementById('interes3');
const resultante3 = document.getElementById('resultante3');

const capitalInput = [capital1, capital2, capital3];
const data = [
    {
        capital: capital1,
        plazo: 30,
        tasa: 0.15,
        interes: interes1,
        resultante: resultante1
    },
    {
        capital: capital2,
        plazo: 180,
        tasa: 0.10,
        interes: interes2,
        resultante: resultante2
    },
    {
        capital: capital3,
        plazo: 60,
        tasa: 0.23,
        interes: interes3,
        resultante: resultante3
    }
];

// Creamos las variables que seran utilizadas como flag
let capitalValid = false;

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
    capitalValid = true;
    capitalInput.forEach(elemento => {
        const validacion = validateInput(elemento);
        if (capitalValid === true && !validacion) {
            capitalValid = false
        };
    });
};

const calcularIntereses = ({capital, plazo, tasa, interes, resultante}) => {
    const capitalInt = +capital.textContent
    const interesResultante = capitalInt * plazo * tasa / 100;
    const capitalResultante = capitalInt + interesResultante;
    write(interes, interesResultante);
    write(resultante, capitalResultante);
};

const calcular= ()=> {
    validateData();
    if (!capitalValid) {
        write(errorMSG, 'Por favor, verifique los datos ingresados.')
    } else {
        data.forEach(elemento => {
            calcularIntereses({
                capital: elemento.capital,
                plazo: elemento.plazo,
                tasa: elemento.tasa,
                interes: elemento.interes,
                resultante: elemento.resultante
            });
        });
    }
};