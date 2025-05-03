// https://www.codewars.com/kata/5873b2010565844b9100026d/train/javascript

function oneTwoThree(n) {
    let s1 = n === 0 ? '0' : '9'.repeat(n / 9) + (n % 9 ? (n % 9).toString() : '');
    let s2 = n > 0 ? '1'.repeat(n) : '0';
    return [s1, s2];
}