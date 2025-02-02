// https://www.codewars.com/kata/5938f5b606c3033f4700015a/train/javascript

function alphabetWar(fight) {
    let map = {'w': 4, 'p': 3, 'b': 2, 's': 1, 'm': -4, 'q': -3, 'd': -2, 'z': -1};

    const array1 = [];
    const arrya2 = fight.split('')
    for (let i = 0; i < fight.length; i++) {
        if (arrya2[i - 1] !== '*' && arrya2[i] !== '*' && arrya2[i + 1] !== '*') {
            array1.push(arrya2[i])
        }
    }
    let sum = array1.reduce((a, b) => a + (map[b] ? map[b] : 0), 0)
    return sum < 0 ? 'Right side wins!' :
        sum > 0 ? 'Left side wins!' :
            'Let\'s fight again!';
}