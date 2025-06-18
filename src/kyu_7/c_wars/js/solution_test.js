const strictEqual = require('chai').assert.strictEqual;

function doTest(input, expected) {
    const actual = initials(input);
    strictEqual(actual, expected, `for "${input}"`);
}

describe("Tests", () => {
    it("sample tests", () => {
        doTest('code wars', 'C.Wars');
        doTest('Barack hussain obama', 'B.H.Obama');
        doTest('barack hussain Obama', 'B.H.Obama');
    });
});
