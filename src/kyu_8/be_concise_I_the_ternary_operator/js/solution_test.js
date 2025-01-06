describe("Your refactored solution", () => {
    it("should still exhibit the exact same behaviour as the function prior to refactoring", () => {
        Test.assertEquals(describeAge(9), "You're a(n) kid");
        Test.assertEquals(describeAge(10), "You're a(n) kid");
        Test.assertEquals(describeAge(11), "You're a(n) kid");
        Test.assertEquals(describeAge(12), "You're a(n) kid");
        Test.assertEquals(describeAge(13), "You're a(n) teenager");
        Test.assertEquals(describeAge(14), "You're a(n) teenager");
        Test.assertEquals(describeAge(15), "You're a(n) teenager");
        Test.assertEquals(describeAge(16), "You're a(n) teenager");
        Test.assertEquals(describeAge(17), "You're a(n) teenager");
        Test.assertEquals(describeAge(18), "You're a(n) adult");
        Test.assertEquals(describeAge(19), "You're a(n) adult");
        Test.assertEquals(describeAge(63), "You're a(n) adult");
        Test.assertEquals(describeAge(64), "You're a(n) adult");
        Test.assertEquals(describeAge(65), "You're a(n) elderly");
        Test.assertEquals(describeAge(66), "You're a(n) elderly");
        Test.assertEquals(describeAge(100), "You're a(n) elderly");
    });
});