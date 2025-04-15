const chai = require("chai");
const assert = chai.assert;
chai.config.truncateThreshold = 0;

describe("Basic tests", () =>{
    it("Tests", () => {
        assert.strictEqual(leaderB('g964', 36097, 20000), "To beat g964's score, I must complete 5365 Beta kata and 2 8kyu kata. Dammit!");
        assert.strictEqual(leaderB('GiacomoSorbi', 23914, 23867), "To beat GiacomoSorbi's score, I must complete 15 Beta kata and 2 8kyu kata.");
        assert.strictEqual(leaderB('ZozoFouchtra', 15991, 12000), "To beat ZozoFouchtra's score, I must complete 1330 Beta kata and 1 8kyu kata. Dammit!");
        assert.strictEqual(leaderB('webtechalex', 884, 900), 'Winning!');
        assert.strictEqual(leaderB('petegarvin1', 3307, 100), "To beat petegarvin1's score, I must complete 1069 Beta kata and 0 8kyu kata. Dammit!");
        assert.strictEqual(leaderB('myjinxin2015', 15720, 15720), 'Only need one!');
    })
})