function testing(actual, expected) {
    Test.assertEquals(actual, expected);
}

describe("Basic tests",function() {
    it("containAllRots",function() {
        testing(containAllRots("", []), true)
        testing(containAllRots("", ["bsjq", "qbsj"]), true)
        testing(containAllRots("bsjq", ["bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs"]), true)
        testing(containAllRots("XjYABhR", ["TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY"]), false)
    })})