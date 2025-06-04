const { assert } = require("chai")

describe('Boiled Eggs', function() {
    it('should calculate the cooking time', function() {
        assert.strictEqual(cookingTime(0), 0, '0 eggs');
        assert.strictEqual(cookingTime(5), 5, '5 eggs');
        assert.strictEqual(cookingTime(10), 10, '10 eggs');
    });
});