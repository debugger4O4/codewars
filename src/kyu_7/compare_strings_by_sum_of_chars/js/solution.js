// https://www.codewars.com/kata/576bb3c4b1abc497ec000065/train/javascript

function compare(s1, s2){
    const fun = $ => typeof($) === 'string' && ($.toUpperCase().match(/[A-Z]/g) || []).length === $.length ? [...$.toUpperCase()] : []
    const red = $ => $.reduce((acc, el) => acc + el.codePointAt(), 0)
    return red(fun(s1)) === red(fun(s2))
}