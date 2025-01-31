const assert = require('chai').assert;
describe("Sample tests", () => {
    const testCases = [
        ['dgm', 'disturbing gregarious mustache'],
        ['lkj', 'literal klingon joke'],
        ['interesting', 'ingestable newtonian turn eager rant eager stylish turn ingestable newtonian gregarious'],
        ['codewars', 'confident oscillating disturbing eager weird awesome rant stylish'],
    ];
    for(const [input, expected] of testCases)
        it(`Testing for ${JSON.stringify(input)}`, () => assert.strictEqual(makeBackronym(input), expected));
});
