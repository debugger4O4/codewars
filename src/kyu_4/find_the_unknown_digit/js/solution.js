// https://www.codewars.com/kata/546d15cebed2e10334000ed9/train/javascript

function solveExpression(exp) {
    const operators = {'+': (a, b) => +a + +b, '-': (a, b) => a - b, '*': (a, b) => a * b};
    const tokenize = /^\s*(?<operand1>-?[\d?]+)\s*(?<operator>[+\-*])\s*(?<operand2>-?[\d?]+)\s*=\s*(?<result>-?[\d?]+)\s*$|/;
    const {
        groups: {
            operand1,
            operator,
            operand2,
            result
        }
    } = exp.match(tokenize);
    if (!result) {
        return -1;
    }

    const digits = Array.from({length: 10}, (_, idx) => idx)
        .filter(f => !(operand1 + operand2 + result).includes(f))
        .filter(f => {
            const [operand1_, operand2_, result_] =
                [operand1, operand2, result].map(str => str.replace(/\?/g, f).replace(/^-?0(?!$)/, 'X'));

            return operators[operator](operand1_, operand2_) == result_;
        });

    return digits.sort()[0] ?? -1;
}