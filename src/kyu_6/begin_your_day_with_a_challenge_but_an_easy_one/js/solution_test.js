const { assert, config } = require('chai');
config.truncateThreshold = 0;

describe('Tests', () => {
    const test = (input, expected) => {
        assert.deepEqual(oneTwoThree(input), expected, `Test failed for input (n = ${input})`);
    };

    it('Sample Tests', () => {
        const tests = [
            [0,  ['0', '0']],
            [1,  ['1', '1']],
            [2,  ['2', '11']],
            [3,  ['3', '111']],
            [19, ['991', '1111111111111111111']],
        ];
        for (const [input, expected] of tests) {
            test(input, expected);
        }
    });
});