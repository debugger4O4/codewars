// https://www.codewars.com/kata/5700c9acc1555755be00027e/solutions/javascript

function containAllRots(strng, arr) {
    for (let i = 0; i < strng.length; i++) {
        if (arr.indexOf(strng.slice(i) + strng.slice(0, i)) === -1) {
            return false;
        }
    }
    return true;
}

module.export = containAllRots;