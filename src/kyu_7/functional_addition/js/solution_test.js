const { assert } = require('chai');

describe('Functional addition tests', function() {

    it('add(3) should return a function', function() {
        assert.isFunction(add(3), 'add(3) did not return a function');
    });

    it('add(3)(1) should return a number', function() {
        assert.isNumber(add(3)(1), 'add(3)(1) did not return a number');
    });

    it('Addition tests', function() {
        assert.strictEqual(add(1)(3), 4, 'add(1)(3)');
        assert.strictEqual(add(1)(-5), -4, 'add(1)(-5)');
        assert.strictEqual(add(3)(20), 23, 'add(3)(20)');
    });

});
