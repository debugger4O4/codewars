// https://www.codewars.com/kata/55968ab32cf633c3f8000008/train/javascript

function initials(n) {
    return (
        n.split` `.map((el) => el[0].toUpperCase()).join`.`.slice(0, -1) +
        n.split` `.slice(-1)[0][0].toUpperCase() +
        n.split` `.slice(-1).join``.slice(1)
    );
}