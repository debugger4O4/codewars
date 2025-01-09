import codewars_test as test
from solution import zero_or_one

sample_test_cases = [

    #    n     s              result

    (1,  [[1,1,0,1]],     [1, 1, 0, 1]),

    (3,  [[1,0,1,0,1],
          [1,0,1,0,1],
          [0,1,0,1,0]],   [1, 0, 1, 0, 1]),

    (3,  [[1,0,1,0,1],
          [1,1,1,0,1],
          [0,1,1,1,0]],   [1, 1, 1, 0, 1]),

    (5,  [[1,0,0,0,0],
          [0,1,0,0,0],
          [0,0,1,0,0],
          [0,0,0,1,0],
          [0,0,0,0,1]],   [0, 0, 0, 0, 0]),
]

@test.describe('Sample tests')
def sample_tests():
    @test.it('Testing zero_or_one')
    def _():
        for n, s, expected in sample_test_cases:
            test.assert_equals(zero_or_one(n, s), expected)