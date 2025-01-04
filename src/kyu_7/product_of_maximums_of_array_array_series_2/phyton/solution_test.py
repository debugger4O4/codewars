import codewars_test as test

try:
    from solution import maxProduct as max_product
except ImportError:
    from solution import max_product

@test.describe("Fixed Tests")
def basic_tests():

    @test.it("Sample Tests")
    def sample_tests():
        test.assert_equals(max_product([0]*10, 5), 0)
        test.assert_equals(max_product([4,3,5], 2), 20)
        test.assert_equals(max_product([10,8,7,9], 3), 720)
        test.assert_equals(max_product([8,6,4,6], 3), 288)

    @test.it("Larger arrays")
    def larger_arrays():
        test.assert_equals(max_product(list(range(10, -1, -1)), 5), 10*9*8*7*6)
        test.assert_equals(max_product([10,2,3,8,1,10,4], 5), 9600)
        test.assert_equals(max_product([13,12,-27,-302,25,37,133,155,-1], 5), 247895375)

    @test.it("Arrays with negative values")
    def negative_array():
        test.assert_equals(max_product([-4,-27,-15,-6,-1],2), 4)
        test.assert_equals(max_product([-17,-8,-102,-309],2), 136)

    @test.it("Arrays with positive and negative values")
    def positive_negative_array():
        test.assert_equals(max_product([10,3,-27,-1], 3), -30)
        test.assert_equals(max_product([14,29,-28,39,-16,-48],4), -253344)