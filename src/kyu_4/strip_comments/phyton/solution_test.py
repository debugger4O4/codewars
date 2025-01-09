import codewars_test as test
try:
    from solution import solution
except ImportError:
    from solution import strip_comments
    solution = strip_comments


@test.describe('Test case')
def test_group():
    @test.it('Example')
    def test_case():
        test.assert_equals(solution('apples, pears # and bananas\ngrapes\nbananas !apples', ['#', '!']), 'apples, pears\ngrapes\nbananas')
        test.assert_equals(solution('a #b\nc\nd $e f g', ['#', '$']), 'a\nc\nd')
        test.assert_equals(solution(' a #b\nc\nd $e f g', ['#', '$']), ' a\nc\nd')