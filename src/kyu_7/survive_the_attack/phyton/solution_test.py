import codewars_test as test
from solution import is_defended

# add your sample tests
@test.describe("Basic tests")
def test_group():
    test.assert_equals(is_defended([ 2, 9, 9, 7 ], [ 1, 1, 3, 8]), False)
    test.assert_equals(is_defended([1,3,5,7], [2,4,6,8]), True)
    test.assert_equals(is_defended([10, 10, 1, 1], [4, 4, 7, 7]), True)
    test.assert_equals(is_defended([], [1,2,3]), True)
    test.assert_equals(is_defended([1,2,3], []), False)
