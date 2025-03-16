from solution import squares_needed
import codewars_test as test

@test.describe("rice and chessboard problem")
def rice_and_chessboard_problem():

    @test.it("Basic tests")
    def basic_tests():
        test.assert_equals(squares_needed(0), 0)
        test.assert_equals(squares_needed(1), 1)
        test.assert_equals(squares_needed(2), 2)
        test.assert_equals(squares_needed(3), 2)
        test.assert_equals(squares_needed(4), 3)
