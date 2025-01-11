function outed(meet, boss){
    let arr = [];
    for (var key in meet){
        arr.push(meet[key]);
    }
    arr.push(meet[boss]);
    let sum = arr.reduce((a, b) => a+b);
    let avg = sum / (arr.length - 1);
    return avg > 5 ? 'Nice Work Champ!' : 'Get Out Now!'
}