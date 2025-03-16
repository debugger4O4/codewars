import codewars_test as test
from solution import add

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it("returned value should be callable")
    def basic_test_cases():
        test.expect(callable(add(666)), 'not callable')

    @test.it("purity")
    def _():
        adders = [add(i) for i in range(10)]
        for i in range(len(adders)):
            test.assert_equals(adders[i](666), i + 666, 'your function does not seem pure')

    @test.it("Basic Tests")
    def basic_test_cases():
        test.assert_equals(add(1)(3), 4, 'add(1)(3)')
        test.assert_equals(add(0)(-15), -15, 'add(0)(-15)')
        add_three = add(3)
        test.assert_equals(add_three(5), 8, 'add(3)(5)')
        test.assert_equals(add_three(5), 8, 'add(3)(5) again - make sure your add(3) is pure!')