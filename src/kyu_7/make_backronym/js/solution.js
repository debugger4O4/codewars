// https://www.codewars.com/kata/55805ab490c73741b7000064/train/javascript

let makeBackronym = function(string) {
    return string.toUpperCase().split('').map(m => dict[m]).join(' ');
}