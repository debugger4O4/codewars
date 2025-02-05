// https://www.codewars.com/kata/559cc2d2b802a5c94700000c/train/javascript

function consecutive(arr) {
    let arr1 = [];
    for (let i = arr.sort((a, b) => a - b)[0]; i <= arr.sort((a, b) => a - b)[arr.length - 1]; i++) {
        arr1.push(i)
    }

    return arr1.length - arr.length;
}