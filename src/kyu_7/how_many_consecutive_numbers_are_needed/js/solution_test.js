describe('Tests', function () {

    const { strictEqual } = require('chai').assert;

    function doTest(input, expected) {
        const actual = consecutive(input.slice());
        strictEqual(actual, expected, `for array = ${JSON.stringify(input)}\n`);
    }

    it('fixed tests', function () {
        doTest([4, 8, 6], 2);
        doTest([1, 2, 3, 4], 0);
        doTest([], 0);
        doTest([1], 0);
    });
});