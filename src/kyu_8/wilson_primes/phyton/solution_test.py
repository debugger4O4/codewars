import codewars_test as test
from solution import am_i_wilson


@test.describe('Wilson Primes')
def tests():
    @test.it('Example tests')
    def wilson_prime():
        for n, expected in (
                (0, False),
                (1, False),
                (5, True),
                (8, False),
                (9, False)
        ):
            test.assert_equals(am_i_wilson(n), expected, f"Test failed for n = {n}")
