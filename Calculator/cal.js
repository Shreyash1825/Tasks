let currentInput = '';
let operator = '';
let firstOperand = '';
let secondOperand = '';

function appendNumber(number) {
    currentInput += number;
    updateDisplay();
}

function appendOperator(op) {
    if (currentInput !== '') {
        if (operator === '' && firstOperand === '') {
            firstOperand = currentInput;
        } else if (operator !== '' && firstOperand !== '' && secondOperand === '') {
            secondOperand = currentInput;
            calculate();
        }
        operator = op;
        currentInput = '';
    }
}

function calculate() {
    if (operator !== '' && firstOperand !== '' && secondOperand !== '') {
        const num1 = parseFloat(firstOperand);
        const num2 = parseFloat(secondOperand);
        let result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        currentInput = result.toString();
        operator = '';
        firstOperand = '';
        secondOperand = '';
        updateDisplay();
    }
}

function clearDisplay() {
    currentInput = '';
    operator = '';
    firstOperand = '';
    secondOperand = '';
    updateDisplay();
}

function updateDisplay() {
    document.getElementById('display').value = currentInput;
}
