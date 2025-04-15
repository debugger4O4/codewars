// https://www.codewars.com/kata/57d28215264276ea010002cf/train/javascript

function leaderB(user, user_score, your_score) {
    const betaScore = ~~(Math.abs(your_score - user_score) / 3);
    const eightKyuScore = Math.abs(your_score - user_score) - betaScore * 3;

    switch (true) {
        case user_score === your_score:
            return 'Only need one!';
        case user_score < your_score:
            return 'Winning!';
        default:
            return `To beat ${user}'s score, I must complete ${betaScore} Beta kata and ${eightKyuScore} 8kyu kata${
                betaScore > 1000 ? '. Dammit!' : '.'
            }`;
    }
}