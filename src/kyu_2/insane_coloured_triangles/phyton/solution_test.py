import codewars_test as test
from solution import triangle

basic_cases = [
    ['B', 'B'],
    ['GB', 'R'],
    ['RRR', 'R'],
    ['RGBG', 'B'],
    ['RBRGBRB', 'G'],
    ['RBRGBRBGGRRRBGBBBGG', 'G']
]

@test.describe('Insane Coloured Triangles')
def fixed_tests():
    for _in, _out in basic_cases:
        @test.it(f'row = {repr(_in)}')
        def basic_test_cases():
            test.assert_equals(triangle(_in), _out)