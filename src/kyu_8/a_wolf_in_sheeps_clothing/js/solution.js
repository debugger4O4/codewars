function warnTheSheep(queue) {

    let index = queue.reverse().indexOf("wolf");

    return index === 0 ?
        "Pls go away and stop eating my sheep" :
        "Oi! Sheep number " + index + "! You are about to be eaten by a wolf!";
}