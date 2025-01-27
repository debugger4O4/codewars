const strictEqual = require("chai").assert.strictEqual;

function doTest (s1, s2, expected) {
    const actual = compare(s1, s2);
    const quote = str => str === null ? null : `"${str}"`;
    strictEqual(actual, expected, `for strings:\n${quote(s1)}\n${quote(s2)}\n`);
}

describe("Tests", () => {
    it("sample tests", () => {
        doTest("AD", "BC", true);
        doTest("AD", "DD", false);
        doTest("gf", "FG", true);
        doTest("Ad", "DD", false);
        doTest("zz1", "", true);
        doTest("ZzZz", "ffPFF", true);
        doTest("kl", "lz", false);
        doTest("!!", "7476", true);
        doTest("##", "1176", true);

        doTest(null, "BC", false);
        doTest(null, null, true);
        doTest(null, "", true);
        doTest("", "", true);
    });
});